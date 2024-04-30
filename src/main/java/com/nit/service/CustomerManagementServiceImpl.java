package com.nit.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.nit.entity.Customer;
import com.nit.repository.ICustRepository;

@Component
@Service
public class CustomerManagementServiceImpl implements ICustomerManagementService {

	@Autowired
	private ICustRepository custRepo;

	@Override
	public String registerCustomer(Customer cust) {
		System.out.println("Proxy class Name::" + custRepo.getClass() + "...."
				+ Arrays.toString(custRepo.getClass().getInterfaces()));
		// save the object
		Customer cust1 = custRepo.save(cust);
		return "Customer is saved(record inserted) with id value:" + cust1.getCno();

	}

	@Override
	public boolean isCustomerAvailable(int id) {
		return custRepo.existsById(id);
	}

	@Override
	public long showCustomerCount() {
		return custRepo.count();
	}

	@Override
	public Iterable<Customer> showAllCustomer() {
		return custRepo.findAll();
	}

	@Override
	public Iterable<Customer> showAllCustomerById(Iterable<Integer> id) {

		return custRepo.findAllById(id);
	}

	@Override
	public String registerGroupCustomer(List<Customer> custList) {
		Iterable<Customer> savedCustList = custRepo.saveAll(custList);
		return custList.size() + " number of record saved";
	}

	/*@Override
	public Customer showCustomerById(Integer id) {
		return custRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid id"));
	}*/

	/*@Override
	public Customer showCustomerById(Integer id) {
		Optional<Customer> opt=custRepo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		else
		 throw new IllegalArgumentException("Invalid id");
	}*/

	@Override
	public Customer showCustomerById(Integer id) {
		Customer incust = new Customer();
		incust.setCname("hello");
		incust.setCaddress("Bollo");
		incust.setBillAmount(00.00f);
		Customer cust = custRepo.findById(id).orElse(incust);
		return cust;
	}

	@Override
	public String registerOrUpdateCustomer(Customer cust) {
		Optional<Customer> opt = custRepo.findById(cust.getCno());
		if (opt.isPresent()) {
			custRepo.save(cust); // update the object
			return cust.getCno() + " customer is updated";
		} else {
			Customer scust = custRepo.save(cust);
			return scust.getCno() + " Customer is saved";
		}
	}

	@Override
	public String updateCustomerAddress(int cno, String newAddress) {
		Optional<Customer> opt = custRepo.findById(cno);
		if (opt.isPresent()) {
			Customer cust = opt.get();
			cust.setCaddress(newAddress);
			custRepo.save(cust);
			return cno + " Customer address is updated";
		}
		return cno + " Customer address is not found for updation";
	}

	@Override
	public String removeCustomerById(int cno) {
		Optional<Customer> opt = custRepo.findById(cno);
		if (opt.isPresent()) {
			custRepo.deleteById(cno);
			return cno + " Customer is deleted";
		}
		return cno + " Customer is not found";
	}

	@Override
	public String removeCustomer(Customer cust) {
		Optional<Customer> opt = custRepo.findById(cust.getCno());
		if (opt.isPresent()) {
			custRepo.delete(cust);
			return cust.getCno() + " Customer is deleted";
		}
		return cust.getCno() + " customer is not found";
	}

	@Override
	public String removeAllCustomer() {
		custRepo.deleteAll();
		return "All Customer deleted";
	}

	@Override
		public String removeSelectedCustomer(List<Integer> cnos) {
			
			return null;
		}

}
