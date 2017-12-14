package com.boraji.tutorial.springboot.service;

import com.boraji.tutorial.springboot.dao.cassandra.CustomerRepository;
import com.boraji.tutorial.springboot.entity.cassandrasql.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllBook(){
        List<Customer> customer = new ArrayList<>();
        customerRepository.findAll().forEach(customer::add);
        return customer;
    }

    public Customer getBook(Long id)
    {
        return customerRepository.findOne(id);
    }

    public void addBook(Customer customer)
    {
        customerRepository.save(customer);
    }

    public void updateBook(Long id, Customer customer)
    {
        customerRepository.save(customer);
    }

    public void deleteBook(Long id)
    {
        customerRepository.delete(id);
    }
}
