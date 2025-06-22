public class PaypalAdapter implements PaymentProcessor{
    PaypalGateway paypalGateway;

    public PaypalAdapter(PaypalGateway p){
        this.paypalGateway = p;
    }

    @Override
    public void processPayment(double amt){
        paypalGateway.makePayment(amt);
    }
}