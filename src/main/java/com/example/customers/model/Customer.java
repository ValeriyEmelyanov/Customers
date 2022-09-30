package com.example.customers.model;

import lombok.Data;

@Data
public class Customer {
    private Long customerId;
    private String firstName;
    private String lastName;
}
