import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentContext context = new PaymentContext();

        System.out.println("Enter details for payment using credit card");
        System.out.print("Enter card number: ");
        String cardNumber = sc.nextLine();
        System.out.print("Enter card holder name: ");
        String name = sc.nextLine();
        System.out.print("Enter cvv: ");
        String cvv = sc.nextLine();
        PaymentStrategy creditCard = new CreditCardPayment(cardNumber, name, cvv);
        context.setPaymentStrategy(creditCard);
        System.out.print("Enter amount: ");
        double amt1 = sc.nextDouble();
        context.pay(amt1);
        System.out.println("------------------------------------------------");

        System.out.println("Enter details for payment using PayPal");
        System.out.print("Enter email: ");
        sc.nextLine();
        String email = sc.nextLine();
        PaymentStrategy paypal = new PayPalPayment(email);
        System.out.print("Enter amount: ");
        double amt2 = sc.nextDouble();
        context.setPaymentStrategy(paypal);
        context.pay(amt2);
    }
}