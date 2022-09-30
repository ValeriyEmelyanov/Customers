package com.example.customers.mapper;

import com.example.customers.dto.CustomerResponse;
import com.example.customers.model.Customer;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CustomerToResponse implements Converter<Customer, CustomerResponse> {
    @Override
    public CustomerResponse convert(Customer source) {
        CustomerResponse response = new CustomerResponse();
        response.setCustomerId(source.getCustomerId());
        response.setFirstName(source.getFirstName());
        response.setLastName(source.getLastName());

        return response;
    }
}
