package com.eazybytes.accounts.service;

import com.eazybytes.accounts.Dto.CustomerDto;
import org.springframework.data.repository.query.Param;

public interface IAccountsService {

    /** it's saying that this method is going to accept param of type customerDto object
     * if someone adding new in our project they got to know for this method.
     *
     * @param customerDto
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber
     * @return
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     *
     * @param customerDto
     * @return
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber
     * @return
     */
    boolean deleteAccount(String mobileNumber);
}
