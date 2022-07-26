package telcoProject.Entities;

import java.util.List;

import telcoProject.Type.ServiceType;

public class Service {
	
	private int id;
	private ServiceType serviceType;
	private Product product;
	private List<Invoice> invoices;
	private List<Subscription> subscriptions;
	
	



	public Service(int id, ServiceType serviceType, Product product) {
		this.id = id;
		this.serviceType = serviceType;
		this.product = product;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public ServiceType getServiceType() {
		return serviceType;
	}


	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public List<Invoice> getInvoices() {
		return invoices;
	}


	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}


	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}


	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}
	
	
	
}
