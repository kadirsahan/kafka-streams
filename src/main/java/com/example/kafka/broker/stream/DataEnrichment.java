package com.example.kafka.broker.stream;

import com.example.kafka.repos.CustomerDebitCreditCardMappingRepository;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.EnableKafkaStreams;

import java.util.Arrays;


@Configuration
@EnableKafka
@EnableKafkaStreams
public class DataEnrichment {

    @Value("${kafka.topic.input}")
    private String inputTopic;

    @Value("${kafka.topic.output}")
    private String outputTopic;

    @Autowired
    private EnrichTransaction enrichTransaction;

    @Bean
    public KStream<String, String> kStream(StreamsBuilder kStreamBuilder) {
        KStream<String, String> stream = kStreamBuilder.stream(inputTopic);

        stream
                //.mapValues(value -> first_transform(value.toString()))
                //.mapValues(value -> EnrichTransactionWithHirakiCP.enrichTransactionInfo(value.toString()))
                .mapValues(value -> enrichTransaction.enrichData(value.toString()))
                .to(outputTopic);
        //  stream.;
        return stream;
    }

}



