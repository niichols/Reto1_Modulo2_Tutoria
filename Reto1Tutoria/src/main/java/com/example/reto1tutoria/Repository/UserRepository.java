package com.example.reto1tutoria.Repository;

import com.example.reto1tutoria.Model.User;
import com.example.reto1tutoria.Repository.CRUD.UserCRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
    @Autowired
    private UserCRUDRepository userCRUDRepository;

    //Funciones Basicas
    public List<User> getAll(){    //Select all
        return (List<User>) userCRUDRepository.findAll();
    }

    public Optional<User> getUser(int id){   //Select con un id
        return userCRUDRepository.findById(id);
    }

    public User save(User user){        //Guardar un usuario
        return userCRUDRepository.save(user);
    }

    public Optional<User> findByEmail(String email){   //Select por email
        return userCRUDRepository.findAllByEmail(email);
    }
    public Optional<User> findByEmailAndPassword(String email, String password){  //Select email y password
        return userCRUDRepository.findAllByEmailAndPassword(email, password);
    }

    public void delete(User user){   //Delete por usuario
        userCRUDRepository.delete(user);
    }

}
