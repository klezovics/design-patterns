package com.klezovich.design_patterns.structural.facade.improved;

public class InvoiceCustomerSystem {

	public void createInvoiceForBill(Bill bill){
		System.out.println("Creating invoice for bill with amount: "+bill.getAmount());
	}
	
}
