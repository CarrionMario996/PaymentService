package com.payment.service.service;

import com.payment.service.model.dto.PaymentDto;
import com.payment.service.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements IPaymentService{
    @Autowired
    private PaymentRepository repository;
    @Override
    public List<PaymentDto> findByIdClient(Long id) {
        return repository.findByIdClient(id);
    }
}
