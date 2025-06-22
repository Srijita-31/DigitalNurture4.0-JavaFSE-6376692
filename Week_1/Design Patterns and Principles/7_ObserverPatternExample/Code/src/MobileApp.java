public class MobileApp implements Observer{
    private final String appName;

    public MobileApp(String appName) {
        this.appName = appName;
    }

    @Override
    public String getAppName(){
        return appName;
    }

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println(appName + " received update -> " + stockName + ": $" + stockPrice);
    }
}