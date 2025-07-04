import java.util.Scanner;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double predictFutureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return (1 + growthRate) * predictFutureValue(presentValue, growthRate, years - 1);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String choice;
            
            System.out.println("Financial Forecasting Tool:");
            
            do {
                try {
                    /
                    System.out.print("\nEnter the present value (Rs.): ");
                    double presentValue = scanner.nextDouble();
                    
                    System.out.print("Enter the annual growth rate (in %): ");
                    double growthRatePercent = scanner.nextDouble();
                    double growthRate = growthRatePercent / 100;
                    
                    System.out.print("Enter the number of years: ");
                    int years = scanner.nextInt();
                    
                    /
                    double futureValue = predictFutureValue(presentValue, growthRate, years);
                    System.out.printf("Future value after %d years: Rs%.2f\n", years, futureValue);
                    
                    
                    System.out.print("\nDo you want to calculate again? (yes/no): ");
                    scanner.nextLine(); 
                    choice = scanner.nextLine().trim().toLowerCase();
                    
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter numbers only.");
                    scanner.nextLine(); 
                    choice = "yes"; 
                }
                
            } while (choice.equals("yes") || choice.equals("y"));
            
            System.out.println("Exiting....");
        }
    }
}
