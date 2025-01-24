package com.easybytes.accounts.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Accounts extends BaseEntity{

    @Column
    private Long customerId;

    @Id
    private String accountNumber;

    @Column
    private String accountType;

    @Column
    private String branchAddress;
}
