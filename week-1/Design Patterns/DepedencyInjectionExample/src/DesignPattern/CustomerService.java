package DesignPattern;

public class CustomerService {
	private CustomerRepository customerRepository;
	
	public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
	
	public String getCustomerById(String customerId) {
        return customerRepository.findCustomerById(customerId);
    }
	

}
