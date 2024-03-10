package com.proyecto.persistencia.crud;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserCrudRepository {
}
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserCrudRepository extends CrudRepository<User,Long> {
    boolean existsByUsername(String username);
    Optional<User> findByUsername(String username);
}