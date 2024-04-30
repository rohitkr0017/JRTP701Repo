package com.nit.service;

import java.util.List;

import com.nit.entity.Customer;

public interface ICustomerManagementService {
	public String registerCustomer(Customer cust);
	public boolean isCustomerAvailable(int id);
	public long showCustomerCount();
	public Iterable<Customer> showAllCustomer();
	public Iterable<Customer> showAllCustomerById(Iterable<Integer> id);
	public String registerGroupCustomer(List<Customer> custList);
	public Customer showCustomerById(Integer id);
	public String registerOrUpdateCustomer(Customer cust);
	public String updateCustomerAddress(int cno,String newAddress);
	public String removeCustomerById(int cno);
	public String removeCustomer(Customer cust);
	public String removeAllCustomer();
	public String removeSelectedCustomer(List<Integer> cnos);
	
	
}
