package com.dinesh.productmicroservice.repository;

import com.dinesh.productmicroservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
