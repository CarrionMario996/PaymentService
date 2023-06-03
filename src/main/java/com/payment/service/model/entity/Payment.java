package com.payment.service.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="client_id")
    private Long clientId;
    @Column(name="payment_system")
    private String paymentSystem;
    @Column(name="payment_system_name")
    private String paymentSystemName;
    @Column(name="return_code")
    private String returnCode;
    private String message;

}
