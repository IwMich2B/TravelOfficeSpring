package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.repository.TravelOffice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OfficeController {


    @Autowired
    TravelOffice travelOffice;

    @GetMapping("/travel")
    public Map<Long, Customer> getMapCustomer() {
        return travelOffice.getAllCustomer();
    }

    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer) {
        travelOffice.addCustomer(customer);
        return customer;
    }
}
