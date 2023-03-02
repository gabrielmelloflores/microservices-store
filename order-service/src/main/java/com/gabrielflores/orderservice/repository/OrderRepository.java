package com.gabrielflores.orderservice.repository;

import com.gabrielflores.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
