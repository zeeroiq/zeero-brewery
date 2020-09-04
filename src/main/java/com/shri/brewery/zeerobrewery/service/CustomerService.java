/*******************************************************************************
 * Created by  ZeeroIQ on $today.date.
 ******************************************************************************/

package com.shri.brewery.zeerobrewery.service;

import com.shri.brewery.zeerobrewery.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);
}
