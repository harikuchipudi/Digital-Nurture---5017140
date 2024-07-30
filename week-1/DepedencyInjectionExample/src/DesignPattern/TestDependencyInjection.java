package DesignPattern;

public class TestDependencyInjection {
	public static void main(String[] args) {
		CustomerRepository customerRepository = new CutomerRepositoryImpl();
		
		CustomerService customerService = new CustomerService(customerRepository);
		
		String customerId = "1";
        String customerName = customerService.getCustomerById(customerId);
        
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
		
	}
}
