package org.spring.objectmapperex.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.spring.objectmapperex.model.Order;
import org.spring.objectmapperex.model.Product;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private long id;
    private String orderDate;

    private String address;

    private double totalPrice;

    private List<Product> products;

    public Order parseProductToJson(ObjectMapper mapper) throws JsonProcessingException {
        return mapper.convertValue(this, Order.class);
    }
}
