package com.boraji.tutorial.springboot.dao.cassandra;

import com.boraji.tutorial.springboot.entity.cassandrasql.Customer;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	
	@Query(value="SELECT * FROM customer WHERE firstname=?0")
	public List<Customer> findByFirstname(String firstname);

	@Query("SELECT * FROM customer WHERE age > ?0 ALLOW FILTERING")
	public List<Customer> findCustomerHasAgeGreaterThan(int age);
}