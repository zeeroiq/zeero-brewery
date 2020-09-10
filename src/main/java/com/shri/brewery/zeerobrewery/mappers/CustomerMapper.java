package com.shri.brewery.zeerobrewery.mappers;

import com.shri.brewery.zeerobrewery.domain.Customer;
import com.shri.brewery.zeerobrewery.model.CustomerDto;
import org.mapstruct.Mapper;

/*
 * Created by  ZeeroIQ on 9/10/20, 11:14 PM
 */
@Mapper
public interface CustomerMapper {
    Customer CustomerDtoToCustomer(CustomerDto customerDto);
    CustomerDto CustomerToCustomerDto(Customer customer);
}
