package com.example.customers.service.Impl;

import com.example.customers.dto.CustomerRequest;
import com.example.customers.dto.CustomerResponse;
import com.example.customers.exception.CustomerNotFoundException;
import com.example.customers.model.Customer;
import com.example.customers.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final ConcurrentHashMap<Long, Customer> customers = new ConcurrentHashMap<>();
    private final AtomicLong index = new AtomicLong(0L);

    private final ConversionService conversionService;

    @Override
    public CustomerResponse create(CustomerRequest request) {
        Customer customer = new Customer();
        customer.setCustomerId(index.incrementAndGet());
        customer.setFirstName(request.getFirstName());
        customer.setLastName(request.getLastName());
        customers.put(customer.getCustomerId(), customer);

        return conversionService.convert(customer, CustomerResponse.class);
    }

    @Override
    public CustomerResponse getById(Long customerId) {
        Customer customer = customers.get(customerId);
        if (customer == null) {
            throw new CustomerNotFoundException();
        }

        return conversionService.convert(customer, CustomerResponse.class);
    }
}
