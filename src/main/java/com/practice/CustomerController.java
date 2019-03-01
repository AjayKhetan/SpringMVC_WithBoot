package com.practice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService;

	
	@RequestMapping("/")
	public ModelAndView homePage(){
	return new ModelAndView("customer");
	}
	
	@RequestMapping("insertCustomer")
	public ModelAndView addCustomer(@RequestParam("customerId") int customer_id,
			@RequestParam("profile_firstname") String first_name,
			@RequestParam("profile_lastname") String last_name,
			@RequestParam("wallet_balance") int balance,
			@RequestParam("wallet_type") String type){
		
		ModelAndView modelAndView=new ModelAndView();
		if(null==first_name || null==last_name){
			Error error=new Error();
			error.setError_code("123");
			error.setError_desc("first_name/Last_name should not be empty..");
			modelAndView.addObject("error",error);
			modelAndView.setViewName("error");
			return modelAndView;
		}
		
		Profile profile=new Profile();
		profile.setFirst_name(first_name);
		profile.setLast_name(last_name);
		
		Wallet wallet=new Wallet();
		wallet.setBalance(balance);
		wallet.setType(type);
		
		Customer customer=new Customer();
		customer.setCustomerId(customer_id);
		customer.setProfile(profile);
		customer.setWallet(wallet);
		
		
		modelAndView.addObject(customer);
		
		String text=customerService.insertCustomer(customer);
		
		if(text=="customer obj getting null. please check.."){
			modelAndView.setViewName("error1");
		}else{
			if(null!=text){
				modelAndView.addObject(customer);
				modelAndView.setViewName("success");
			}
		}
		
		return modelAndView;
		
	}

    

}