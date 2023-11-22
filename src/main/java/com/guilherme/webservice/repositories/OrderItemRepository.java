package com.guilherme.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
