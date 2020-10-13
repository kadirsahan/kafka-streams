package com.example.kafka.broker.stream;

import com.example.kafka.model.CustomerDebitCreditCardMapping;
import com.example.kafka.repos.CustomerDebitCreditCardMappingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class EnrichTransaction {

    @Autowired
    private CustomerDebitCreditCardMappingRepository customerDebitCreditCardMappingRepository;

    @Value(value = "${message.begin}")
    private int begin;

    @Value(value = "${message.end}")
    private int end;

    public String enrichData(String transactionInfo){

        String debitCardNumber = transactionInfo.substring(begin,end);
        List<CustomerDebitCreditCardMapping> customers = customerDebitCreditCardMappingRepository.findByDebitCardNumber(debitCardNumber);
        String CreditCardNumber= customers.get(0).getCreditCardNumber();
        return CreditCardNumber;
    }
}
