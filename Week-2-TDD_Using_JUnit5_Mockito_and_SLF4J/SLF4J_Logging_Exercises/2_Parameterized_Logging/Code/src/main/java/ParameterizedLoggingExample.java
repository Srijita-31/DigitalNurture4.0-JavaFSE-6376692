import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {

    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {

        String itemName = "Laptop";
        int itemQuantity = 2;
        double itemPrice = 1200.50;
        logger.info("Processing order for item: {} - Quantity: {}", itemName, itemQuantity);

        String customerName = "John Doe";
        String orderId = "ORD-7890";
        double totalAmount = 2401.00;

        logger.info("New order received from customer {} (ID: {}). Total amount: ${}",
                customerName, orderId, totalAmount);


        int failedAttempts = 3;
        String userId = "user123";
        logger.warn("Failed login attempts for user {}: {}. Account might be locked.", userId, failedAttempts);


        try {
            int divisor = 0;
            int result = 100 / divisor; // This will intentionally throw an ArithmeticException
            // The line below will not be reached due to the exception
            logger.info("Result of division: {}", result);
        } catch (ArithmeticException e) {
            // Logging an exception with parameters in the message
            // The last 'e' argument ensures the full stack trace is logged.
            logger.error("Error occurred while performing calculation for user {}: {}", userId, e.getMessage(), e);
        }

        String debugInfo = "Debugging network connection.";
        boolean connected = true;
        logger.debug("Debug status: {}. Connected: {}", debugInfo, connected);

        System.out.println("Parameterized logging example completed. Check your console for SLF4J output.");
    }
}
