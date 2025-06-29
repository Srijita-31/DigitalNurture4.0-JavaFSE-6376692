import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DifferentAppenderExample {

    // Obtaining a logger instance for this class
    private static final Logger logger = LoggerFactory.getLogger(DifferentAppenderExample.class);

    // Obtaining a specific logger for a custom package (as defined in logback.xml)
    // This logger will have its own level and appenders if configured
    private static final Logger specificLogger = LoggerFactory.getLogger("com.yourname.slf4j3.specific");

    public static void main(String[] args) {
        // Log messages using the default logger
        // These messages will go to both CONSOLE and FILE appenders as per root logger config (level INFO)
        logger.info("This is an INFO message from the main logger.");
        logger.warn("This is a WARNING message from the main logger.");
        logger.error("This is an ERROR message from the main logger.");
        logger.debug("This is a DEBUG message from the main logger."); // Might not show in file if default level is INFO

        System.out.println("--- Using Specific Logger ---");

        // Log messages using the specific logger
        // This logger is configured in logback.xml to output DEBUG level to CONSOLE only
        specificLogger.debug("This is a DEBUG message from the specific logger.");
        specificLogger.info("This is an INFO message from the specific logger.");
        specificLogger.warn("This is a WARNING message from the specific logger.");

        // Log an exception to demonstrate stack trace logging
        try {
            int denominator = 0;
            int result = 100 / denominator;
            System.out.println(result); // This line won't be reached
        } catch (ArithmeticException e) {
            logger.error("An arithmetic error occurred: {}", e.getMessage(), e);
        }

        System.out.println("Logging demonstration completed. Check both console and logs/application.log file.");
    }
}
