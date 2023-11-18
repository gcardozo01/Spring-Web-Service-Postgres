package com.guilherme.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
