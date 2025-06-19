public class Logger {
    // Step 1: Private static instance
    private static Logger instance;

    // Step 2: Private constructor
    private Logger() {
        System.out.println("Logger Initialized");
    }

    // Step 3: Public static method to return the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // only creates once
        }
        return instance;
    }

    // Sample logging method
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
