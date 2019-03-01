package com.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;


public class CustomerDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public String add_customer(Customer customer){
		String sql = "insert into customer (id, firstname,lastname,balance,type) values (?,?,?,?,?)";
		int i = jdbcTemplate.update(sql, customer.getCustomerId(),customer.getProfile().getFirst_name(),customer.getProfile().getLast_name(),customer.getWallet().getBalance(),customer.getWallet().getType());
		if (i != 0) {
		return "Customer Saved Successfully!! ";
		} else {
		return "FAILURE:: While SAVING";
		}
	}
	
	

}
