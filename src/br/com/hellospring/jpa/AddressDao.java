package br.com.hellospring.jpa;

import java.util.List;

public interface AddressDao {
	
	public Integer add(Address address);
	
	public List<Address> findByCustomer(Customer customer);

}
