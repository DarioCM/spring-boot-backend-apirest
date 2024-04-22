package com.carlos.springboot.backend.apirest.controller;

import com.carlos.springboot.backend.apirest.models.entity.Customer;
import com.carlos.springboot.backend.apirest.models.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController //API rest
@RequestMapping("/v1/api") //url enpoint /versioning
public class CustomerRestController  {

    private ICustomerService customerService;

    @Autowired
    public CustomerRestController(@Qualifier("v1") ICustomerService customerService) {
        this.customerService = customerService;
    }

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

    @PutMapping("/customers/{id}")
    public Customer update(@RequestBody Customer customer, @PathVariable Long id){
        Customer auxCustomer = customerService.findById(id);

        auxCustomer.setEmail(customer.getEmail());
        auxCustomer.setName(customer.getName());
        auxCustomer.setLastName(customer.getLastName());

        return customerService.save(auxCustomer);

    }

    @DeleteMapping("/customers/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        customerService.delete(id);
    }

}
