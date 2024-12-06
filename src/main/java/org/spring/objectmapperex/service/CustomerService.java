package org.spring.objectmapperex.service;

import lombok.AllArgsConstructor;
import org.spring.objectmapperex.model.Customer;
import org.spring.objectmapperex.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {
    private CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
