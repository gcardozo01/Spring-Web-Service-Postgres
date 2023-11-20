package com.guilherme.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
