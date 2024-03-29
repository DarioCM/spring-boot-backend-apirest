package com.carlos.springboot.backend.apirest.controller;

import com.carlos.springboot.backend.apirest.models.entity.Customer;
import com.carlos.springboot.backend.apirest.models.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //API rest
@RequestMapping("/api") //url enpoint
public class CustomerRestController  {

    @Autowired
    private ICustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> index() {
        return customerService.findAll();
    }


}
