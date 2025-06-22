import java.util.HashMap;

public class InventoryManager {
    private final HashMap<Long, Product> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product added with id " + product.getProductId());
    }

    public void updateProduct(long productId, int quantity, double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
            System.out.println("Product with id " + product.getProductId() + " is updated successfully");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(long productId) {
        if (inventory.containsKey(productId)) {
            Product removed = inventory.remove(productId);
            System.out.println("Product removed: " + removed);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void displayAllProducts() {
        System.out.println("All Products:");
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}