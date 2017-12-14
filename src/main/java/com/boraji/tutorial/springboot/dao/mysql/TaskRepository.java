package com.boraji.tutorial.springboot.dao.mysql;

import com.boraji.tutorial.springboot.entity.mysql.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Integer> {

}
