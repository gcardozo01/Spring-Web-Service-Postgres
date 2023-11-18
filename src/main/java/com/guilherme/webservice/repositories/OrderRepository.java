package com.guilherme.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
