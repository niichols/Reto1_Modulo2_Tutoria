package com.example.reto1tutoria.Repository.CRUD;

import com.example.reto1tutoria.Model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserCRUDRepository extends CrudRepository <User, Integer> {

    public Optional<User> findAllByEmail(String email); //Select por email
    public Optional<User> findAllByEmailAndPassword(String email, String password);
}
