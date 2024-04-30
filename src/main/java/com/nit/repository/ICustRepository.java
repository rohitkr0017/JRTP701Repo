package com.nit.repository;

import org.springframework.data.repository.CrudRepository;

import com.nit.entity.Customer;

public interface ICustRepository extends CrudRepository<Customer, Integer> {

}
