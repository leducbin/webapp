package com.boraji.tutorial.springboot.service;

import com.boraji.tutorial.springboot.dao.mysql.TaskRepository;
import com.boraji.tutorial.springboot.dao.mysql.UserRepository;
import com.boraji.tutorial.springboot.entity.mysql.Task;
import com.boraji.tutorial.springboot.entity.mysql.UserDetails;
import com.boraji.tutorial.springboot.entity.postgresql.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public List<UserDetails> addUser(UserDetails userDetails)
    {
        userRepository.save(userDetails);
        List<UserDetails> user = new ArrayList<>();
        userRepository.findAll().forEach(user::add);
        return user;
    }

    public List<UserDetails> getAll()
    {
        List<UserDetails> user = new ArrayList<>();
        userRepository.findAll().forEach(user::add);
        return user;
    }
}
