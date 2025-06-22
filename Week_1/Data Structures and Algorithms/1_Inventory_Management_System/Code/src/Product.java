public class Product {
    private final long id;
    private final String productName;
    private int quantity;
    private double price;

    public Product(long id, String productName, int quantity, double price) {
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and Setters

    public long getProductId() {
        return id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id=" + id + ", Name=" + productName +
                ", Quantity=" + quantity + ", Price=" + price;
    }
}