package com.geodir.RestPostgreSQL.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.geodir.RestPostgreSQL.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	List<Customer> findByAge(int age);

}
