package org.spring.objectmapperex.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.spring.objectmapperex.model.Customer;
import org.spring.objectmapperex.model.Order;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    private List<Order> orders;

    public Customer parseProductToJson(ObjectMapper mapper) throws JsonProcessingException {
        return mapper.convertValue(this, Customer.class);
    }
}
