package org.spring.objectmapperex.repository;

import org.spring.objectmapperex.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> deleteById(long id);
    Optional<Product> findByName(String name);
}
