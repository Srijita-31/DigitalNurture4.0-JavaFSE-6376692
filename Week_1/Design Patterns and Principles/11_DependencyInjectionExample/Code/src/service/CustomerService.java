package service;

import model.Customer;
import repository.CustomerRepository;

public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void getCustomerInfo(long id) {
        Customer customer = customerRepository.findCustomerById(id);
        System.out.println("Customer Info: " + customer);
    }
}