package com.carlos.springboot.backend.apirest.models.dao;

import com.carlos.springboot.backend.apirest.models.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerDao extends CrudRepository<Customer,Long> {

}
