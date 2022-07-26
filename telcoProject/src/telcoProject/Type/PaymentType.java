package telcoProject.Type;

public class PaymentType {
	private int id;
	private String paymentName;
	
	public PaymentType(int id, String paymentName) {
		this.id = id;
		this.paymentName = paymentName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPaymentName() {
		return paymentName;
	}

	public void setPaymentName(String paymentName) {
		this.paymentName = paymentName;
	}
	
	
	
}
