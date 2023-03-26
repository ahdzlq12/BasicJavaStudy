package ch02;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		VIPCustomer vipCustomer = new VIPCustomer();
		Customer Test = new VIPCustomer();
		
		customer.setCustomerName("Tom");
		customer.calcPrice(1);
		vipCustomer.setCustomerName("Davis");
		vipCustomer.calcPrice(1);
	}

}
