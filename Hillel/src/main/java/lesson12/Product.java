package lesson12;

public class Product {
    private String name;
    private double price;
    private int quantity;

    private static int totalQuantity = 0;

    // Конструктор класу для ініціалізації товару
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        totalQuantity += quantity;
    }

    public static int getTotalQuantity() {
        return totalQuantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

