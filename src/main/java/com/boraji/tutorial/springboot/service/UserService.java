package com.boraji.tutorial.springboot.service;

import com.boraji.tutorial.springboot.dao.mysql.TaskRepository;
import com.boraji.tutorial.springboot.dao.mysql.UserRepository;
import com.boraji.tutorial.springboot.entity.mysql.Task;
import com.boraji.tutorial.springboot.entity.mysql.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TaskRepository taskRepository;

    public Task addUser(UserDetails userDetails)
    {
        userRepository.save(userDetails);
        taskRepository.findOne(1);
        return taskRepository.findOne(1);
    }
}
