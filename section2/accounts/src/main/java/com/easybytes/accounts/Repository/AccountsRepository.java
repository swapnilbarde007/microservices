package com.easybytes.accounts.Repository;

import com.easybytes.accounts.Entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<Accounts,Long> {
}
