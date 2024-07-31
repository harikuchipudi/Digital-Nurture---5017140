package DesignPattern;
import java.util.*;

public class CutomerRepositoryImpl implements CustomerRepository {
	
	private Map<String, String> customerData;
	
	
	public CutomerRepositoryImpl() {
        customerData = new HashMap<>();
        customerData.put("1", "Hari Kiran");
        customerData.put("2", "Chaitanya");
        
        
    }
	
	@Override
	public String findCustomerById(String customerId) {
		return customerData.get(customerId);
	}
}
