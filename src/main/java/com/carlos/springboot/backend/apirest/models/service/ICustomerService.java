package com.carlos.springboot.backend.apirest.models.service;

import com.carlos.springboot.backend.apirest.models.entity.Customer;

import java.util.List;

public interface ICustomerService {

    public List<Customer> findAll();

    public Customer findById(Long id);

    public Customer save(Customer customer);

    public void delete(Long id);

    public String getHelloMessage();

}
