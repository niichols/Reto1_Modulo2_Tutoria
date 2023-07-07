package com.example.reto1tutoria.Controller;

import com.example.reto1tutoria.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.reto1tutoria.Model.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public User save(@RequestBody User user){
        return userService.save(user);
    }
    @GetMapping("/all")
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/{email}")
    public boolean emailExist(@PathVariable String email){
        return userService.emailExists(email);
    }

    @GetMapping("{email}/{password}")
    public User authUser(@PathVariable String email, @PathVariable String password){
        return userService.authUser(email, password);
    }

}
