package br.com.hellospring.jpa;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
	
	CustomerDao customerDao;
	AddressDao addressDao;
	

	@Override
	public Integer add(Address address) {
		return addressDao.add(address);
	}

	@Override
	public Integer create(Customer customer) {
		return customerDao.create(customer);
	}

	@Override
	public Integer create(Customer customer, Address address) {
		Integer idCustomer = customerDao.create(customer);
		address.setCustomer(customer);
		return idCustomer;
	}

	@Override
	public void update(Customer customer) {
		customerDao.update(customer);

	}

	@Override
	public void delete(Integer id) {
		customerDao.delete(id);

	}

	@Override
	public Customer findById(Integer id) {
		return customerDao.findById(id);
	}

	@Override
	public List<Customer> findAll() {
		return customerDao.findAll();
	}

	@Override
	public List<Customer> findByName(String name) {
		return customerDao.findByName(name);
	}

	@Override
	public List<Address> findByCustomer(Customer customer) {
		return addressDao.findByCustomer(customer);
	}
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	public void setAddressDao(AddressDao addressDao) {
		this.addressDao = addressDao;
	}
}
