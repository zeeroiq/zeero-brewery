/*******************************************************************************
 * Created by  ZeeroIQ on $today.date.
 ******************************************************************************/

package com.shri.brewery.zeerobrewery.service;

import com.shri.brewery.zeerobrewery.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(customerId)
                .name("Zeero IQ")
                .build();
    }
}
