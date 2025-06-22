public class WebApp implements Observer{
    private final String appName;

    public WebApp(String appName) {
        this.appName = appName;
    }

    @Override
    public String getAppName(){
        return appName;
    }

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println(appName + " shows new price -> " + stockName + ": $" + stockPrice);
    }
}