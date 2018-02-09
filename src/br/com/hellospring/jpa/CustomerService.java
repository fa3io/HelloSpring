package br.com.hellospring.jpa;

import java.util.List;

public interface CustomerService {

	Integer create(Customer customer);
	
	Integer create(Customer customer, Address address);

	void update(Customer customer);

	void delete(Integer id);

	Customer findById(Integer id);

	List<Customer> findAll();

	List<Customer> findByName(String name);

	Integer add(Address address);

	List<Address> findByCustomer(Customer customer);

}
