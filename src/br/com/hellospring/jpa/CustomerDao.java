package br.com.hellospring.jpa;

import java.util.List;

public interface CustomerDao {

	Integer create(Customer customer);
	
	void update(Customer customer);
	
	void delete(Integer id);
	
	Customer findById(Integer id);
	
	List<Customer> findAll();
	
	List<Customer> findByName(String name);
}
