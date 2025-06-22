public class SlackNotifierDecorator extends NotifierDecorator{
    public SlackNotifierDecorator(Notifier notifier){
        super(notifier);
    }

    public void sendSlack(String msg){
        System.out.println("Sending Slack: "+msg);
    }

    @Override
    public void send(String msg){
        super.send(msg);
        sendSlack(msg);
    }
}