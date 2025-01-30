package com.easybytes.accounts.Repository;

import com.easybytes.accounts.Entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountsRepository extends JpaRepository<Accounts,Long> {

    Optional<Accounts> findByCustomerId(Long customerId);
}
