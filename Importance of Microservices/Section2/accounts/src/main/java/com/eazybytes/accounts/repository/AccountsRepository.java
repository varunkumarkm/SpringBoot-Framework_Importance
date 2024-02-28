package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Accounts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

    Optional<Accounts> findByCustomerId(Long customerId);

    @Transactional
    @Modifying
    /**
     * Whenever we try to update or delete with custom methods we need to mention two annotations on top
     * these abstract method @Modifying will tell to the spring data jpa framework these method will go
     * to modify the data that's why please execute the query of this method inside a transaction for that
     * reason we're mentioning @Transactional
     */
    void deleteByCustomerId(Long customerId);
}
