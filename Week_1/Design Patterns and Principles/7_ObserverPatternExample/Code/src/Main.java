public class Main {
    public static void main(String[] args){
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp("MobileApp");
        Observer webApp = new WebApp("WebApp");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStock("AAPL", 150.0);
        stockMarket.setStock("GOOG", 2725.0);

        stockMarket.removeObserver(mobileApp);
        stockMarket.setStock("TSLA", 695.0);
    }
}