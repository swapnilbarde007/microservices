package com.easybytes.accounts.Service;

import com.easybytes.accounts.dto.CustomerDto;

public interface IAccountsService {


    /**
     *
     * @param customerDto - Customer DTO Object
     */
    void createAccount(CustomerDto customerDto);

}
