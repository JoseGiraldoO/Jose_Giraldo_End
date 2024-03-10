package com.proyecto.dominio.repository;
import com.proyecto.persistencia.entity.user;

public interface UserRepository {
}
import com.proyecto.dominio.repository.UserRepository;

import java.util.List;

public interface UserRepository {
    List<User> findAll();

    User save(User user);
    boolean existsByUsername(String username);
}