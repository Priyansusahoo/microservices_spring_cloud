package com.bluecomet.accounts.mapper;

import com.bluecomet.accounts.model.dto.CustomerDto;
import com.bluecomet.accounts.model.entity.Customer;

public final class CustomerMapper {

    private CustomerMapper () {}


    public static CustomerDto mapToCustomerDto(Customer customer,
                                               CustomerDto customerDto)
    {
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());

        return customerDto;
    }



    public static Customer mapToCustomer (CustomerDto customerDto,
                                          Customer customer)
    {
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobileNumber(customerDto.getMobileNumber());

        return customer;
    }


}
