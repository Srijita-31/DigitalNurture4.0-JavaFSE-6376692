public class RazorpayAdapter implements PaymentProcessor{
    RazorpayGateway razorpayGateway;

    public RazorpayAdapter(RazorpayGateway r){
        this.razorpayGateway = r;
    }

    @Override
    public void processPayment(double amt){
        razorpayGateway.doPayment(amt);
    }
}