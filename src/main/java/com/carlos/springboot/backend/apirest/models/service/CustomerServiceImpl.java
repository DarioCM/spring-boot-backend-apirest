package com.carlos.springboot.backend.apirest.models.service;

import com.carlos.springboot.backend.apirest.models.dao.ICustomerDao;
import com.carlos.springboot.backend.apirest.models.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service // By default, beans are singleton scope in Spring.
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerDao customerDao;

    @Override
    @Transactional(readOnly = true)
    public List<Customer> findAll() {
        return (List<Customer>) customerDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Customer findById(Long id) {
        return customerDao.findById(id).orElse(new Customer());
        //if null return empty object
    }

    @Override
    @Transactional
    public Customer save(Customer customer) {
        return customerDao.save(customer);
    }

    @Override
    @Transactional
    public void delete(Long id) {
         customerDao.deleteById(id);
    }

    @Override
    public String getHelloMessage() {
        return "hello";
    }
}
