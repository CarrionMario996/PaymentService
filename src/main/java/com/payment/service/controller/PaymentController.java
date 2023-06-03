package com.payment.service.controller;

import com.payment.service.model.dto.PaymentDto;
import com.payment.service.service.IPaymentService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0.0/payment")
public class PaymentController {

    @Autowired
    private IPaymentService service;

    @GetMapping("/{id}")
    public List<PaymentDto> findByIdClient(@PathVariable Long id){
        return service.findByIdClient(id);
    }
}
