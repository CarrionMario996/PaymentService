package com.payment.service.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PaymentDto {
    private String paymentSystemName;
    private String message;
}
