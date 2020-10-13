package com.example.kafka.repos;

import com.example.kafka.model.CustomerDebitCreditCardMapping;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerDebitCreditCardMappingRepository extends CrudRepository<CustomerDebitCreditCardMapping,Integer> {
    List<CustomerDebitCreditCardMapping> findByDebitCardNumber(String DebitCardNumber);
}
