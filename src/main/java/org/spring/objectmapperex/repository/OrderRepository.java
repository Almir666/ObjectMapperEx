package org.spring.objectmapperex.repository;

import org.spring.objectmapperex.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Order deleteOrderById(long id);
}
