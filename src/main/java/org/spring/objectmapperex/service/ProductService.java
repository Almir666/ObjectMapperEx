package org.spring.objectmapperex.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.spring.objectmapperex.dto.ProductDTO;
import org.spring.objectmapperex.model.Product;
import org.spring.objectmapperex.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    private ObjectMapper objectMapper;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public ProductDTO getProductById(Long id) throws JsonProcessingException {
        Product product = productRepository.findById(id).orElseThrow(RuntimeException::new);
        return product.parseResponseToJson(objectMapper);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Product product) {
        Product newProduct = productRepository.findById(product.getId()).orElseThrow(RuntimeException::new);
        newProduct.setName(product.getName());
        newProduct.setDescription(product.getDescription());
        newProduct.setCost(product.getCost());
        newProduct.setQuantityInStock(product.getQuantityInStock());

        return productRepository.save(newProduct);
    }
    public Product deleteProduct(long id) {
        return productRepository.deleteById(id).orElseThrow(RuntimeException::new);
    }
}
