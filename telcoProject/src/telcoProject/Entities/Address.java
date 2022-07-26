package telcoProject.Entities;

import java.util.ArrayList;
import java.util.List;

public class Address {
	private int id;
	private String addressDetail;
	private Customer customer;
	private List<Invoice> invoices = new ArrayList<>();
	private List<Service> services= new ArrayList<>();
	
	public Address() 
	{
		
	}
	
	
	public Address(int id, String addressDetail, Customer customer) {
		this.id = id;
		this.addressDetail = addressDetail;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Invoice> getInvoices() {
		return invoices;
	}

	public List<Service> getServices() {
		return services;
	}
	
	
	
	
	
}
