public interface Observer {
    void update(String stockName, double stockPrice);
    String getAppName();
}