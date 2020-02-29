package onlineShop.dao;

import onlineShop.model.Customer;

public interface CustomerDao {
	
	void addCustomer(Customer custoemr);
	Customer getCustomerByUserName(String userName);
}
