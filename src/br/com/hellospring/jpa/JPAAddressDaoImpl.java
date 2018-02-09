package br.com.hellospring.jpa;

import java.util.List;

import org.springframework.orm.jpa.support.JpaDaoSupport;

public class JPAAddressDaoImpl extends JpaDaoSupport implements AddressDao {

	@Override
	public Integer add(Address address) {
		getJpaTemplate().persist(address);
		return address.getId();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Address> findByCustomer(Customer customer) {
		return getJpaTemplate().find("FROM address a WHERE a.customer = ?1 ", customer);
	}

}
