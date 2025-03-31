package com.bluecomet.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bluecomet.accounts.model.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

}
