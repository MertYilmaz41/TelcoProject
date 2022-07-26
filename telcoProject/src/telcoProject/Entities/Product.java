package telcoProject.Entities;

import java.util.List;

import telcoProject.Type.ProductType;

public class Product {
	private int id;
	private String serialNumber;
	private String brand;
	private List<ProductType> productTypes;
	private List<Service> services;
	
	public Product() 
	{
		
	}
	
	public Product(int id, String serialNumber, String brand) {
		super();
		this.id = id;
		this.serialNumber = serialNumber;
		this.brand = brand;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public List<ProductType> getProductTypes() {
		return productTypes;
	}

	public void setProductTypes(List<ProductType> productTypes) {
		this.productTypes = productTypes;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}
	
	
}
