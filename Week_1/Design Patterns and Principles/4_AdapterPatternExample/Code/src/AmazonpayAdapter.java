public class AmazonpayAdapter implements PaymentProcessor{
    AmazonpayGateway amazonpayGateway;

    public AmazonpayAdapter(AmazonpayGateway a){
        this.amazonpayGateway = a;
    }

    @Override
    public void processPayment(double amt){
        amazonpayGateway.newPayment(amt);
    }
}