package com.carlos.springboot.backend.apirest.models.service;

import com.carlos.springboot.backend.apirest.models.entity.Customer;

import java.util.List;

public interface ICustomerService {

    public List<Customer> findAll();

    public String getHelloMessage();

}
