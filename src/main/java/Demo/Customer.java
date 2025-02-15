package Demo;

public class Customer implements Comparable<Customer> {

    private String name;
    private int customerId;

    public Customer(String name, int customerId) {
        super();
        this.name = name;
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return name;
    }

    public int getCustomerId() {
        return customerId;
    }

    @Override
    public int compareTo(Customer o) {
        return Double.compare(o.getCustomerId(),this.getCustomerId());
    }


}
