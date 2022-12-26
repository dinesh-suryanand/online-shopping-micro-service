package com.dinesh.ordermicroservice.repository;

import com.dinesh.ordermicroservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
