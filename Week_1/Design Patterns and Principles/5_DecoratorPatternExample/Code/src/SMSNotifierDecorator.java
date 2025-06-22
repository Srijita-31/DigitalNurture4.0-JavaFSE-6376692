public class SMSNotifierDecorator extends NotifierDecorator{
    public SMSNotifierDecorator(Notifier notifier){
        super(notifier);
    }

    public void sendSMS(String msg){
        System.out.println("Sending SMS: "+msg);
    }
    @Override
    public void send(String msg){
        super.send(msg);
        sendSMS(msg);
    }
}