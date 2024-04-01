package com.carlos.springboot.backend.apirest.models.service;

import com.carlos.springboot.backend.apirest.models.dao.ICustomerDao;
import com.carlos.springboot.backend.apirest.models.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerDao customerDao;

    @Override
    @Transactional(readOnly = true)
    public List<Customer> findAll() {
        return (List<Customer>) customerDao.findAll();
    }

    @Override
    public String getHelloMessage() {
        return "hello";
    }
}
