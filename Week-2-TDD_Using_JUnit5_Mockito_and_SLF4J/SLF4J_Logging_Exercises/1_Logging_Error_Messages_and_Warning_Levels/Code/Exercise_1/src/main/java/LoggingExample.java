// Import necessary SLF4J classes
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    // Obtain a logger instance for this class
    // The LoggerFactory is used to get a Logger specific to this class,
    // which helps in identifying the source of log messages.
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        // Log an ERROR message
        // This message indicates a serious problem that requires immediate attention.
        logger.error("This is an error message!");

        // Log a WARN message
        // This message indicates a potentially harmful situation, but not an error.
        logger.warn("This is a warning message!");

        // Log an INFO message (for demonstration, not strictly required by exercise)
        // Provides general information about the application's progress.
        logger.info("This is an info message.");

        // Log a DEBUG message (for demonstration, often used during development)
        // Provides fine-grained informational events useful for debugging.
        logger.debug("This is a debug message.");

        // Log a TRACE message (for demonstration, even finer-grained than debug)
        // Provides very detailed information, typically used for tracing execution flow.
        logger.trace("This is a trace message.");

        // Example of logging with parameters (good practice to avoid string concatenation)
        String user = "Alice";
        int id = 123;
        logger.info("User {} with ID {} logged in.", user, id);

        // Example of logging an exception (ERROR level is common for exceptions)
        try {
            int result = 10/0; // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            logger.error("An error occurred during division:", e);
        }

        System.out.println("Logging example completed. Check your console for output.");
    }
}
