public class EmployeeManagementSystem {
    private final Employee[] employees;
    private int count;

    public EmployeeManagementSystem(int size) {
        employees = new Employee[size];
        count = 0;
    }

    // Adding Employee
    public void addEmployee(Employee emp) {
        if (count < employees.length) {
            employees[count++] = emp;
        } else {
            System.out.println("Employee list is full.");
        }
    }

    // Searching Employee by ID
    public Employee searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null;
    }

    // Traversing Employees
    public void displayAll() {
        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }

    // Deleting Employee by ID
    public void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1]; // shift left
                }
                employees[--count] = null;
                System.out.println("Employee deleted.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}