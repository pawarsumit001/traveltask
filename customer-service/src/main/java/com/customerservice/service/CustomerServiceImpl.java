package com.customerservice.service;

import com.customerservice.entity.Customer;
import com.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public ResponseEntity< Customer> addCustomer(Customer customer) {
        return new ResponseEntity<>(this.customerRepository.save(customer), HttpStatus.OK);
    }

    @Override
    public Optional<?> deleteCustomerById(Long cid) {
          customerRepository.deleteById(cid);

        return null;
    }

    @Override
    public ResponseEntity<List<Customer> >viewAllCustomer() {
        return new ResponseEntity<>(this.customerRepository.findAll(),HttpStatus.FOUND);
    }

    @Override
    public ResponseEntity<?> viewCustomerById(Long cid) {
        return new ResponseEntity<>(this.customerRepository.findById(cid),HttpStatus.FOUND);
    }

    @Override
    public ResponseEntity<?> updateCustomerById(Long cid ,Customer customer) {
        customerRepository.findById(cid).orElseThrow();
        customer.setCity(customer.getCity());
        customer.setCname(customer.getCname());
        return new ResponseEntity<>(this.customerRepository.save(customer),HttpStatus.OK);
    }
}
