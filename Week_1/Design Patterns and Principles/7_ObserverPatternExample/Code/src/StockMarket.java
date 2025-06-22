import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock{
    private final List<Observer> observers = new ArrayList<>();
    private String stockName;
    private double stockPrice;

    public void setStock(String stockName, double stockPrice) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        System.out.println(o.getAppName() + " Registered");
        observers.add(o);
    }

    
    @Override
    public void removeObserver(Observer o) {
        System.out.println("Removing registration of "+o.getAppName());
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(stockName, stockPrice);
        }
    }

    
    public void registerObserver(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    public void removeObserver(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}