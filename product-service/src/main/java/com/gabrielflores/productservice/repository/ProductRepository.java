package com.gabrielflores.productservice.repository;

import com.gabrielflores.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
