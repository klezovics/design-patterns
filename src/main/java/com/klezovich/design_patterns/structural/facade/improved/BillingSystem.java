package com.klezovich.design_patterns.structural.facade.improved;

public class BillingSystem {

	public Bill createBill(Integer amount){
		
		// Let's assume some advanced logic happens here;
		return new Bill(amount);
		
	}
	
}
