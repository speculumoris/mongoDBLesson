package com.alibo.mongodemo;

import com.alibo.mongodemo.product.Product;
import com.alibo.mongodemo.product.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class MongoDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoDemoApplication.class, args);
    }


}
