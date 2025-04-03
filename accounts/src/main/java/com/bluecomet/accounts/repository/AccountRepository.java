package com.bluecomet.accounts.repository;

import com.bluecomet.accounts.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bluecomet.accounts.model.entity.Account;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

    /**
     *
     * @param customerCustomerId this can be fetched from Customer Obj {@link Customer}
     * @return Optional Account if exists
     */
    Optional<Account> findByCustomer_CustomerId(Long customerCustomerId);

}
