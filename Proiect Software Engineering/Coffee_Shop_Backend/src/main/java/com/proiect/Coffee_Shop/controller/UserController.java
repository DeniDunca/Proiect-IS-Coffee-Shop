package com.proiect.Coffee_Shop.controller;

import com.proiect.Coffee_Shop.dto.UserDto;
import com.proiect.Coffee_Shop.model.User;
import com.proiect.Coffee_Shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/users", produces="application/json", method={RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST})
@CrossOrigin()
public class UserController {

    private UserService userService;
    @Autowired
    public UserController(UserService userService)
    {
        super();
        this.userService = userService;
    }
    @PostMapping("/newClient")
    public ResponseEntity<User> saveUser(@RequestBody User user)
    {
        if(userService.saveUser(user) != user)
            return new ResponseEntity<User>(userService.saveUser(user), HttpStatus.NOT_FOUND);
       return new ResponseEntity<User>(userService.saveUser(user), HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/checkUser")
    public ResponseEntity<UserDto> checkUser(@RequestBody UserDto user)
    {
        if(userService.checkUser(user))
            return new ResponseEntity<UserDto>(user, HttpStatus.ACCEPTED);
        return new ResponseEntity<UserDto>(user, HttpStatus.NOT_FOUND);
    }
}
