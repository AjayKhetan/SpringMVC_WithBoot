package com.practice;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService {
	
	@Autowired
	CustomerDAO customerDAO;
	
	public String insertCustomer(Customer customer){
		
		if(null!=customer){
		
		customerDAO.add_customer(customer);
		return "customer inserted";
		
	}
		return "customer obj getting null. please check..";
		
		
		

}
}
