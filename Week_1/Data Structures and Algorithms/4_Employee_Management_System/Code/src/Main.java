public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem(5);

        // Adding employees
        system.addEmployee(new Employee(101, "Mathew", "Manager", 85000));
        system.addEmployee(new Employee(102, "John", "Developer", 65000));
        system.addEmployee(new Employee(103, "Daisy", "Tester", 35000));

        System.out.println("\n--- All Employees ---");
        system.displayAll();

        int searchId = 102;
        System.out.println("\n--- Searching for Employee with ID " + searchId + " ---");
        Employee found = (Employee) system.searchEmployee(searchId);
        if (found != null) {
            System.out.println("Employee Found:");
            found.display();
        } else {
            System.out.println("Employee not found.");
        }


        int deleteId = 103;
        System.out.println("\n--- Deleting Employee with ID " + deleteId + " ---");
        system.deleteEmployee(deleteId);

        System.out.println("\n--- All Employees After Deletion ---");
        system.displayAll();
    }
}