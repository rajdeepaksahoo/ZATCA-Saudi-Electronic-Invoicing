package com.zatca.service;

import com.zatca.bo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class ZatcaService {
    @Value("${zetca.email}")
    private String email;
    @Value("${zetca.password}")
    private String password;
    @Value("${zetca.url}")
    private String zatcaUrl;
    @Autowired
    private RestTemplate restTemplate;
    public ZetcaTokenResponse getZatcaTokenResponse(){
        Map<String,String> userDetails = new HashMap<>();
        userDetails.put("email",email);
        userDetails.put("password",password);
        HttpEntity<Map<String,String>> httpEntity = new HttpEntity<>(userDetails);

        ResponseEntity<ZetcaTokenResponse> exchange = restTemplate.exchange(zatcaUrl + "/login", HttpMethod.POST, httpEntity, ZetcaTokenResponse.class);

        return exchange.getBody();
    }

    public InvoiceGenerationResponse createInvoice(InvoiceData invoiceData){

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        ZetcaTokenResponse zatcaTokenResponse = getZatcaTokenResponse();
        headers.set("Authorization","Bearer "+zatcaTokenResponse.getData().getAccess_token());
        invoiceData.setUserId(zatcaTokenResponse.getData().getId());
        HttpEntity<InvoiceData> httpEntity = new HttpEntity<>(invoiceData,headers);
        ResponseEntity<InvoiceGenerationResponse> exchange = restTemplate.exchange(zatcaUrl + "/invoice/generate", HttpMethod.POST, httpEntity, InvoiceGenerationResponse.class);
        return exchange.getBody();
    }

    public InvoiceResponse getInvoice(InvoiceRequest invoiceRequest){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        ZetcaTokenResponse zatcaTokenResponse = getZatcaTokenResponse();
        headers.set("Authorization","Bearer "+zatcaTokenResponse.getData().getAccess_token());
        HttpEntity<InvoiceRequest> httpEntity = new HttpEntity<>(invoiceRequest,headers);
        ResponseEntity<InvoiceResponse> exchange = restTemplate.exchange(zatcaUrl + "/invoice/get", HttpMethod.POST, httpEntity, InvoiceResponse.class);
        return exchange.getBody();
    }
}
