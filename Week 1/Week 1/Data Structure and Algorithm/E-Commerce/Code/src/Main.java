import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Linear Search
    public static Product linearSearch(Product[] products, String target) {
        for (Product p : products) {
            if (p.name.equalsIgnoreCase(target)) {
                return p;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, String target) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].name.compareToIgnoreCase(target);
            if (cmp == 0) return products[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    // Sort for Binary Search
    public static void sortByName(Product[] products) {
        Arrays.sort(products, (a, b) -> a.name.compareToIgnoreCase(b.name));
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Footwear"),
            new Product(3, "Book", "Education"),
            new Product(4, "Mobile", "Electronics"),
            new Product(5, "Watch", "Accessories")
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        Product foundLinear = linearSearch(products, name);
        System.out.println("Linear Search: " + (foundLinear != null ? foundLinear : "Not found"));

        sortByName(products);  // Binary search needs sorted array

        Product foundBinary = binarySearch(products, name);
        System.out.println("Binary Search: " + (foundBinary != null ? foundBinary : "Not found"));
    }
}