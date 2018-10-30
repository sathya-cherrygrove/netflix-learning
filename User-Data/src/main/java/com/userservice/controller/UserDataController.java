package com.userservice.controller;

import com.userservice.com.userservice.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserDataController {

    @Autowired

    UserJPARepository userjparepository;

    @RequestMapping("/getUsers")
    public List<Users> getUser() {
        return userjparepository.findAll();


    }

    @RequestMapping("/findOneUser/{$id}")
    public Optional<Users> findOneUser(@RequestParam Integer id)
    {

        return userjparepository.findById(id);

    }

    @RequestMapping("/postUser")
    public String setUser(@RequestBody Users users)
    {
        userjparepository.save(users);
        return "User data logged...";

    }


}
