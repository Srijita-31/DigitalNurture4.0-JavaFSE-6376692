public class TestLogger {
    public static void main(String[] args) {
        // Get two instances of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Use the logger
        logger1.log("This is the first message.");
        logger2.log("This is the second message.");

        // Check if both loggers are the same
        if (logger1 == logger2) {
            System.out.println("Only one instance exists. Singleton confirmed.");
        } else {
            System.out.println("Multiple instances detected. Singleton failed.");
        }
    }
}
