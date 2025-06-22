import java.util.Scanner;
import repository.CustomerRepository;
import service.CustomerRepositoryImplementation;
import service.CustomerService;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer id: ");
        long id = sc.nextLong();

        CustomerRepository repository = new CustomerRepositoryImplementation();
        CustomerService service = new CustomerService(repository);

        service.getCustomerInfo(id);
    }
}
