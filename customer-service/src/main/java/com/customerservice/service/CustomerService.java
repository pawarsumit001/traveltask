package com.customerservice.service;

import com.customerservice.entity.Customer;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    public ResponseEntity<Customer> addCustomer(Customer customer);
    public Optional<?> deleteCustomerById(Long cid);
    public ResponseEntity<List<Customer>> viewAllCustomer();
    public ResponseEntity<?> viewCustomerById(Long cid);

    public ResponseEntity<?> updateCustomerById(Long cid,Customer customer);
}
