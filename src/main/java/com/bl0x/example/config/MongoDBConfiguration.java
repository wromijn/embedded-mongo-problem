package com.bl0x.example.config;

import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

@Configuration
public class MongoDBConfiguration {

    @Value("${spring.data.mongodb.host}")
    String host;

    @Value("${spring.data.mongodb.port}")
    int port;

    @Value("${spring.data.mongodb.database}")
    String databaseName;

    @Bean
    public MongoDbFactory mongoDbFactory() {
        return new SimpleMongoDbFactory(new MongoClient(host, port), databaseName);
    }
}
