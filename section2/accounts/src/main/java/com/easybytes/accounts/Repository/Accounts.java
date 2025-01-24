package com.easybytes.accounts.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Accounts extends JpaRepository<Accounts,Long> {
}
