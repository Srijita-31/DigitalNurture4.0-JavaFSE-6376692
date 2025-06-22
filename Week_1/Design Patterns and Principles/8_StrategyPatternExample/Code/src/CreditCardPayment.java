public class CreditCardPayment implements PaymentStrategy{
    
    private final String cardNumber;
    private String cardHolderName;
    private final String cvv;

    public CreditCardPayment(String cardNumber, String cardHolderName, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cvv = cvv;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rupees." + amount + " using Credit Card.");
    }
}