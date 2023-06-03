package com.payment.service.service;

import com.payment.service.model.dto.PaymentDto;

import java.util.List;

public interface IPaymentService {
    public List<PaymentDto>findByIdClient(Long id);
}
