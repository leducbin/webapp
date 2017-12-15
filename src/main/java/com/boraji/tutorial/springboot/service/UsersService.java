package com.boraji.tutorial.springboot.service;

import com.boraji.tutorial.springboot.dao.postgresql.UsersRepository;
import com.boraji.tutorial.springboot.entity.postgresql.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public List<User> addUsers(User user)
    {
        usersRepository.save(user);
        List<User> userPg = new ArrayList<>();
        usersRepository.findAll().forEach(userPg::add);
        return userPg;
    }

    public List<User> getAll()
    {
        List<User> userPg = new ArrayList<>();
        usersRepository.findAll().forEach(userPg::add);
        return userPg;
    }
}
