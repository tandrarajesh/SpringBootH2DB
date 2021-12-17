package com.javainuse.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javainuse.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}