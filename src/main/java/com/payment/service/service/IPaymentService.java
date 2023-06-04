package com.payment.service.service;

import com.payment.service.model.dto.PaymentDto;
import java.util.Optional;

public interface IPaymentService {
    public Optional<PaymentDto> findByIdClient(Long id);
}
