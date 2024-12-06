package org.spring.objectmapperex.service;

import lombok.AllArgsConstructor;
import org.spring.objectmapperex.model.Order;
import org.spring.objectmapperex.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;


    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order getOrderById(long id) {
        return orderRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
