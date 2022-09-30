package com.example.customers.service;

import com.example.customers.dto.CustomerRequest;
import com.example.customers.dto.CustomerResponse;
import org.springframework.stereotype.Service;

public interface CustomerService {
    CustomerResponse create(CustomerRequest request);
    CustomerResponse getById(Long customerId);
}
