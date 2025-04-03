package com.bluecomet.accounts.exception;

import com.bluecomet.accounts.model.entity.Account;
import com.bluecomet.accounts.model.entity.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {




    /**
     *
     * @param resourceName - e.g - {@link Account} & {@link Customer}
     * @param fieldName - e.g - mobileNumber in {@link Customer}
     * @param fieldValue - e.g - 999999999 - this is a e.g mobileNumber
     */
    public ResourceNotFoundException(String resourceName,
                                     String fieldName,
                                     String fieldValue)
    {
        super(String.format("%s not found with the given input data %s: '%s'", resourceName, fieldName, fieldValue));
    }




}