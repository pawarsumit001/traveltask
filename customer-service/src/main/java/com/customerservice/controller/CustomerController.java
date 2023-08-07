package com.customerservice.controller;

import com.customerservice.entity.Customer;
import com.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.viewAllCustomer().getBody();
    }

    @GetMapping("/{cid}")
    public ResponseEntity<?> getCustomerById(@PathVariable Long cid) {
    return  this.customerService.viewCustomerById(cid);
    }

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer createdCustomer = customerService.addCustomer(customer).getBody();
        return new ResponseEntity<>(createdCustomer, HttpStatus.CREATED);
    }

    @PutMapping("/{cid}")
    public ResponseEntity<?> updateCustomerById(@PathVariable Long cid, @RequestBody Customer customer) {
        return customerService.updateCustomerById(cid, customer);

    }

    @DeleteMapping("/{cid}")
    public ResponseEntity<Void> deleteCustomerById(@PathVariable Long cid) {
        customerService.deleteCustomerById(cid);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

