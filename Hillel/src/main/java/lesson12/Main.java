package lesson12;

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 1000, 5);
        Product smartphone = new Product("Smartphone", 500, 10);

        int totalQuantity = Product.getTotalQuantity();
        System.out.println("Загальна кількість товарів на складі: " + totalQuantity);
    }
}

