package com.bluecomet.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bluecomet.accounts.model.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
