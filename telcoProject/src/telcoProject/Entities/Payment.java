package telcoProject.Entities;

import java.util.List;

import telcoProject.Type.PaymentType;

public class Payment {
	private int id;
	private List<Invoice> invoices;
	private PaymentType paymentType;
	
	public Payment(int id, PaymentType paymentType) {
		this.id = id;
		this.paymentType = paymentType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Invoice> getInvoices() {
		return invoices;
	}

	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}
	
	
}
