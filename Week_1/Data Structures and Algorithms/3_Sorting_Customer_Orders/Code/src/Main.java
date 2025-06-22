public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order(1, "John", 700.0),
                new Order(2, "Mathew", 11500.0),
                new Order(3, "Daisy", 3200.0)
        };


        BubbleSort.sort(orders);
        System.out.println("After Bubble Sort:");
        for (Order o : orders) System.out.println(o);

        // Resetting orders
        orders = new Order[] {
                new Order(1, "John", 700.0),
                new Order(2, "Mathew", 11500.0),
                new Order(3, "Daisy", 3200.0)
        };


        QuickSort.sort(orders, 0, orders.length - 1);
        System.out.println("\nAfter Quick Sort:");
        for (Order o : orders) System.out.println(o);
    }
}