package com.payment.service.controller;

import com.payment.service.exception.RequestException;
import com.payment.service.model.dto.PaymentDto;
import com.payment.service.service.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;

@RestController
@RequestMapping("/api/v1.0.0/payment")
public class PaymentController {

    @Autowired
    private IPaymentService service;

    @GetMapping("/{id}")
    public ResponseEntity<?> findByIdClient(@PathVariable Long id){
        Optional<PaymentDto>response=service.findByIdClient(id);
        if(response.isPresent()){
            return ResponseEntity.ok(response.get());
        }
        throw new RequestException("Payment not found","404",HttpStatus.NOT_FOUND);
    }
}
