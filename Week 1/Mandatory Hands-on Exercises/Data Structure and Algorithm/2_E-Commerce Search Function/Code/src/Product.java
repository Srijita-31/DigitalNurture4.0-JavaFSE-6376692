public class Product {
    int id;
    String name;
    String category;

    Product(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }
@Override
    public String toString() {
        return id + " - " + name + " - " + category;
    }
}
