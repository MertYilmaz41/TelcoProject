package telcoProject.Entities;


import java.time.LocalDate;
import java.util.List;

public class Subscription {
	
	private int id;
	private LocalDate dateStarted;
	private LocalDate dateFinished;
	private Packet packet;
	private SubscriptionAddress subscriptionAddress;
	private Payment payment;
	private List<Invoice> invoices;
	private Service service;
	
	
	public Subscription(int id, LocalDate dateStarted, LocalDate dateFinished, Packet packet,
			SubscriptionAddress subscriptionAddress, Payment payment, Service service) {
		this.id = id;
		this.dateStarted = dateStarted;
		this.dateFinished = dateFinished;
		this.packet = packet;
		this.subscriptionAddress = subscriptionAddress;
		this.payment = payment;
		this.service = service;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDateStarted() {
		return dateStarted;
	}
	public void setDateStarted(LocalDate dateStarted) {
		this.dateStarted = dateStarted;
	}
	public LocalDate getDateFinished() {
		return dateFinished;
	}
	public void setDateFinished(LocalDate dateFinished) {
		this.dateFinished = dateFinished;
	}
	public Packet getPacket() {
		return packet;
	}
	public void setPacket(Packet packet) {
		this.packet = packet;
	}
	public SubscriptionAddress getSubscriptionAddress() {
		return subscriptionAddress;
	}
	public void setSubscriptionAddress(SubscriptionAddress subscriptionAddress) {
		this.subscriptionAddress = subscriptionAddress;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public List<Invoice> getInvoices() {
		return invoices;
	}
	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	

	
	
}
