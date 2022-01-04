package com.proiect.Coffee_Shop.service;

import com.proiect.Coffee_Shop.dto.UserDto;
import com.proiect.Coffee_Shop.model.User;
import com.proiect.Coffee_Shop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository)
    {
        super();
        this.userRepository = userRepository;
    }
    @Override
    public User saveUser(User user) {
        User username = userRepository.findByUsername(user.getUsername());
        System.out.println(user.getUsername());
        System.out.println(username);
        if(username != null)
            return new User("","","","","");
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public boolean checkUser(UserDto userDto){
       User user = userRepository.findByUsername(userDto.getUsername());
        if(user == null)
            return false;
        if(user.getPassword().equals(userDto.getPassword()))
            return true;

       return false;
    }
}
