/*******************************************************************************
 * Created by  ZeeroIQ
 ******************************************************************************/

package com.shri.brewery.zeerobrewery.service;

import com.shri.brewery.zeerobrewery.model.CustomerDto;
import com.shri.brewery.zeerobrewery.service.contracts.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(customerId)
                .name("Zeero IQ")
                .build();
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(customerDto.getId())
                .name(customerDto.getName())
                .build();
    }

    @Override
    public void updateCustomer(UUID beerId, CustomerDto customerDto) {
        log.info("Updating customer");
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.info("Deleting Customer");
    }
}
