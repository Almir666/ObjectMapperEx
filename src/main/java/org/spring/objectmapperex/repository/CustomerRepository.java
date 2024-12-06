package org.spring.objectmapperex.repository;

import org.spring.objectmapperex.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer deleteCustomerById(long id);
}
