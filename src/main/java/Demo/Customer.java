package Demo;

public class Customer {

	private String name;
	private String customerId;
	public Customer(String name, String customerId) {
		super();
		this.name = name;
		this.customerId = customerId;
	}
	
	public String getCustomerName() {
		return name;
	}
}
