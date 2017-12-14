package com.boraji.tutorial.springboot.dao.postgresql;

import com.boraji.tutorial.springboot.entity.postgresql.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Book repository.
 * 
 * @author Radouane ROUFID.
 *
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
