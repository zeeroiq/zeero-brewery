package com.shri.brewery.zeerobrewery.service.contracts;

import com.shri.brewery.zeerobrewery.model.CustomerDto;

import java.util.UUID;

/*
 * Created by  ZeeroIQ on 9/5/20, 12:35 PM
 */

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveCustomer(CustomerDto customerDto);

    void updateCustomer(UUID beerId, CustomerDto customerDto);

    void deleteCustomer(UUID customerId);
}
