package com.boraji.tutorial.springboot.dao.mysql;

import com.boraji.tutorial.springboot.entity.mysql.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Author Repository.
 * 
 * @author Radouane ROUFID.
 *
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
