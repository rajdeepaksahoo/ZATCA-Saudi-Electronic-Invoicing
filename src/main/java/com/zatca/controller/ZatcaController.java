package com.zatca.controller;

import com.zatca.bo.*;
import com.zatca.service.ZatcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZatcaController {
    @Autowired
    private ZatcaService zetcaService;
    @GetMapping("/login")
    public ResponseEntity<ZetcaTokenResponse> getZatcaTokenResponse(){
        return new ResponseEntity<>(zetcaService.getZatcaTokenResponse(), HttpStatus.OK);
    }

    @PostMapping("/generateInvoice")
    public ResponseEntity<InvoiceGenerationResponse> createInvoice(@RequestBody InvoiceData invoiceData){
        return new ResponseEntity<>(zetcaService.createInvoice(invoiceData), HttpStatus.OK);
    }

    @PostMapping("/getInvoice")
    public ResponseEntity<InvoiceResponse> getInvoice(@RequestBody InvoiceRequest invoiceRequest){
        return new ResponseEntity<>(zetcaService.getInvoice(invoiceRequest), HttpStatus.OK);
    }
}
