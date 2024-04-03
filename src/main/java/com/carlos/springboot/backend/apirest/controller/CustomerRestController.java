package com.carlos.springboot.backend.apirest.controller;

import com.carlos.springboot.backend.apirest.models.entity.Customer;
import com.carlos.springboot.backend.apirest.models.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController //API rest
@RequestMapping("/api") //url enpoint
public class CustomerRestController  {

    @Autowired
    private ICustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> index() {
        return customerService.findAll();
    }

    @GetMapping("/customers/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Customer show(@PathVariable Long id){
        return customerService.findById(id);
    }

    @PostMapping("/customers")
    @ResponseStatus(HttpStatus.CREATED)
    public Customer create(@RequestBody Customer customer){
        return customerService.save(customer);
    }



}
