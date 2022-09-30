package com.example.customers.api;

import com.example.customers.dto.CustomerRequest;
import com.example.customers.dto.CustomerResponse;
import com.example.customers.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomerController implements CustomersApi {

    private final CustomerService customerService;

    @Override
    public ResponseEntity<CustomerResponse> create(CustomerRequest customerRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.create(customerRequest));
    }

    @Override
    public ResponseEntity<CustomerResponse> getById(Long customerId) {
        return ResponseEntity.ok(customerService.getById(customerId));
    }
}
