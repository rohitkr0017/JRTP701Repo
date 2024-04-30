package com.nit.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Customer;
import com.nit.service.ICustomerManagementService;

@Component
public class CrudRepositoryTestRunner implements CommandLineRunner {

	@Autowired
	private ICustomerManagementService service;

	@Override
	public void run(String... args) throws Exception {
		// invoke the service class method
		/*try {
			Customer cust=new Customer();
			cust.setCname("Manu");
			cust.setCaddress("Jamshedpur");
			cust.setBillAmount(2100.00f);
			String message=service.registerCustomer(cust);
			System.out.println(message);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		/*try {
			boolean check=service.isCustomerAvailable(100);
			System.out.println("Available Customer by id:: "+check);
			long number=service.showCustomerCount();
			System.out.println("Total number of customer::"+number);
		}catch (Exception e) {
			e.printStackTrace();
			}*/
		/*
				try {
					Iterable<Customer> allCustomer=service.showAllCustomer();
				//			allCustomer.forEach(cust->{
				//				System.out.println(cust);
				//			});
				//			allCustomer.forEach(System.out::println);
							allCustomer.forEach(cust->System.out.println(cust));
					System.out.println(allCustomer);
					for(Customer list:allCustomer) {
						System.out.println(list);
					}
				} catch (Exception e) {
					 e.printStackTrace();
				}*/
		
		/*try {
			Iterable<Customer> list=service.showAllCustomerById(List.of(100,102,500));
			list.forEach(cust->System.out.println(cust));
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		/*try {
			Customer c1=new Customer("Ramesh","Delhi",5000.00f);
			Customer c2=new Customer("Suresh","Noida",3500.00f);
			Customer c3=new Customer("Mahesh","Mumbai",4000.00f);
			List<Customer> custList=List.of(c1,c2,c3);
			String msg=service.registerGroupCustomer(custList);
			System.out.println(msg);
			
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		/*try {
			Customer cust=service.showCustomerById(101);
			System.out.println(cust);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		/*try {
			Customer cust=new Customer(109,"Mukesh","Ranchi",1451.0f);
			String msg=service.registerOrUpdateCustomer(cust);
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		/*try {
			String msg= service.updateCustomerAddress(101, "Pune");
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		/*try {
			String msg=service.removeCustomerById(101);
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		/*try {
			Customer cust=new Customer(100,"Hello","Bolo",000.00f);
			String msg=service.removeCustomer(cust);
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		try {
			String msg=service.removeAllCustomer();
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
