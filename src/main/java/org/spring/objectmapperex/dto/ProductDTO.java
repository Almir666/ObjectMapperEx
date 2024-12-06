package org.spring.objectmapperex.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.spring.objectmapperex.model.Product;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private String name;

    private String description;

    private double cost;

    public Product parseProductToJson(ObjectMapper mapper) throws JsonProcessingException {
        return mapper.convertValue(this, Product.class);
    }
}
