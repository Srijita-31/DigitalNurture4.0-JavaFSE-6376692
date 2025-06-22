
import controller.StudentController;
import java.util.Scanner;
import model.Student;
import view.StudentView;

public class Main {
    public static void main(String[] args) {
        // Take input from user
        try (Scanner scanner = new Scanner(System.in)) {
            // Take input from user
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter student ID: ");
            String id = scanner.nextLine();
            
            System.out.print("Enter student grade: ");
            String grade = scanner.nextLine();
            
            // Create model, view, controller
            Student student = new Student(name, id, grade);
            StudentView view = new StudentView();
            StudentController controller = new StudentController(student, view);
            
            // Display entered details
            System.out.println("\n--- Student Record Created ---");
            controller.updateView();
            
            // Ask if user wants to update
            System.out.print("\nDo you want to update the student details? (yes/no): ");
            String choice = scanner.nextLine();
            
            if (choice.equalsIgnoreCase("yes")) {
                System.out.print("Enter new name: ");
                controller.setStudentName(scanner.nextLine());
                
                System.out.print("Enter new grade: ");
                controller.setStudentGrade(scanner.nextLine());
                
                System.out.println("\n--- Updated Student Details ---");
                controller.updateView();
            }
        }
    }
}
