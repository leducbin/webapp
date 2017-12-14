package com.boraji.tutorial.springboot.dao.mysql;

import com.boraji.tutorial.springboot.entity.mysql.UserDetails;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserDetails, String> {
}
