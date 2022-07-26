package telcoProject.Entities;

public class CorporateCustomer extends Customer{

	
	private String taxNumber;
	private String companyName;

	public CorporateCustomer(int id, String customerNumber, String taxNumber, String companyName) {
		super(id, customerNumber);
		this.taxNumber = taxNumber;
		this.companyName = companyName;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	

	
	
	
}
