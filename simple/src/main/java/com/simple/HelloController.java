package com.simple;

import com.simple.domain.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/customer")
    public Customer getCustomer() {
        var customer = new Customer();
        customer.setId(1);
        customer.setName("Srinivas");
        customer.setEmail("mail@mail.com");
        return customer;
    }
}

