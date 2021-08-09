package com.tts.UsersAPI.controller;

import com.tts.UsersAPI.model.Users;
import com.tts.UsersAPI.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@Repository


public class UserController {
    @Autowired

    UsersRepo UsersRepo;
    @GetMapping("/users")
    public List<Users> getUsers(){
        return (List<Users>) UsersRepo.findAll();
    }
}
