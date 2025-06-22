package service;

import model.Customer;
import repository.CustomerRepository;

public class CustomerRepositoryImplementation implements CustomerRepository {
    @Override
    public Customer findCustomerById(long id) {
        // In a real application, this would interact with a database.
        // but for simplicity, we'll return a dummy customer.
        return new Customer(id, "Srijita Ghorai", "srijita123@gmail.com");
    }
}