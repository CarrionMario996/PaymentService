package com.payment.service.repository;

import com.payment.service.model.dto.PaymentDto;
import com.payment.service.model.entity.Payment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PaymentRepository extends CrudRepository<Payment,Long> {

    @Query(value = "select new com.payment.service.model.dto.PaymentDto(p.paymentSystemName,p.message) from Payment p where p.clientId=?1")
    public Optional<PaymentDto> findByIdClient(Long id);
}
