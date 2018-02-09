package br.com.hellospring.jpa;

import java.util.List;

import org.springframework.orm.jpa.support.JpaDaoSupport;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class JPACustomerDaoImpl extends JpaDaoSupport implements CustomerDao {

	@Override
	public Integer create(Customer customer) {
		getJpaTemplate().persist(customer);
		getJpaTemplate().flush();
		return customer.getId();
	}

	@Override
	public void update(Customer customer) {
		getJpaTemplate().merge(customer);
	}

	@Override
	public void delete(Integer id) {
		Customer customer = findById(id);
		getJpaTemplate().remove(customer);
	}
	
	@Transactional(readOnly = true)
	@Override
	public Customer findById(Integer id) {
		return getJpaTemplate().find(Customer.class, id);
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Customer> findAll() {
		return getJpaTemplate().find("FROM Customer c");
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Customer> findByName(String name) {
		return  getJpaTemplate().find("FROM Customer c WHERE c.name like ?1", name);
	}

}
