package com.payment.service.service;


import com.payment.service.model.dto.PaymentDto;
import com.payment.service.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements IPaymentService{
    @Autowired
    private PaymentRepository repository;
    @Override
    public Optional<PaymentDto> findByIdClient(Long id) {
        Optional<PaymentDto>payment=repository.findByIdClient(id);
        if(payment.isPresent()){
            PaymentDto paymentDto=payment.get();
            return Optional.of(paymentDto);
        }
        return Optional.empty();
    }
}
