package com.boraji.tutorial.springboot.dao.postgresql;

import com.boraji.tutorial.springboot.entity.postgresql.User;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<User, Long> {
}
