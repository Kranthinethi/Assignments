package MavenProjects.springcore;

public class Customer {
	private String Customerid;
	private String customerName;
	private long customerContact;
	private Address customerAddress;
	
	public Customer(String customerid, String customerName, long customerContact, Address customerAddress) {
	
		this.Customerid = customerid;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}

	public String getCustomerid() {
		return Customerid;
	}

	public void setCustomerid(String customerid) {
		Customerid = customerid;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}


	  public Address getCustomerAddress() { return customerAddress; }
	 
	  public void setCustomerAddress(Address customerAddress) {
	  this.customerAddress = customerAddress; }
	

	
	void print() {
		System.out.println("Customer Name:"+getCustomerName());
		System.out.println("CustomerID:"+getCustomerid());
		System.out.println("Customer contact:"+getCustomerContact());
		System.out.println("Customer Address:"+getCustomerAddress().toString());
		System.out.println("------------------------");
	}
	
	
	
}
