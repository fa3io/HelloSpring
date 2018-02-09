package br.com.hellospring.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.hellospring.jpa.Customer;
import br.com.hellospring.jpa.CustomerService;

public class MainJPA {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		System.out.println(context);
		
		CustomerService customerService = (CustomerService) context.getBean("customerService");
		
		Customer fabio = new Customer(null, "Fábio Santos", "fa3io.santos,alves@gmail.com");
		
		System.out.println(customerService);
		
		List<Customer> customers = customerService.findAll();
		System.out.println(customers);
		
		Integer id = customerService.create(fabio);
		System.out.println("ID Gerado: "+ id);
		
		customers = customerService.findAll();
		System.out.println(customers);
	}
}
