package telcoProject.Entities;

import java.util.Date;

public class Invoice {
	
	private int id;
	private Date dateCreated;
	private Date dueDate;
	private Customer customer;
	private Subscription subscription;
	private Address address;
	private Payment payment;
	
	public Invoice(int id, Date dateCreated, Date dueDate, Customer customer, Subscription subscription,
			Address address, Payment payment) {
		super();
		this.id = id;
		this.dateCreated = dateCreated;
		this.dueDate = dueDate;
		this.customer = customer;
		this.subscription = subscription;
		this.address = address;
		this.payment = payment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	

	
}
