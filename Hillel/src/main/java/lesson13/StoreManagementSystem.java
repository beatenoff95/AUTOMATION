package lesson13;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreManagementSystem {
    private List<Product> products;

    public StoreManagementSystem() {
        // Ініціалізуємо список товарів
        products = new ArrayList<>();
    }

    // Метод для додавання нового товару до асортименту
    public void addProduct(String name, String countryOfOrigin, Date manufacturingDate, double price) {
        Product newProduct = new Product(name, countryOfOrigin, manufacturingDate, price);
        products.add(newProduct);
    }

    // Метод для видалення товару за назвою
    public void removeProductByName(String name) {
        products.removeIf(product -> product.getName().equals(name));
    }

    // Метод для видалення товару за країною виробництва
    // **Цей метод можна пропустити, якщо не знайдете рішення.
    public void removeProductByCountry(String country) {
        products.removeIf(product -> product.getCountryOfOrigin().equals(country));
    }

    // Метод для виводу списку усіх товарів у магазині
    public void printAllProducts() {
        for (Product product : products) {
            System.out.println(product.getName() + ", " + product.getCountryOfOrigin() + ", "
                    + product.getManufacturingDate() + ", " + product.getPrice());
        }
    }

    // Метод для пошуку товару за назвою
    public Product findProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null; // Якщо товар не знайдено
    }

    // Метод для пошуку товару за країною виробництва
    public Product findProductByCountry(String country) {
        for (Product product : products) {
            if (product.getCountryOfOrigin().equals(country)) {
                return product;
            }
        }
        return null; // Якщо товар не знайдено
    }

    // Метод для оновлення інформації про товар (зміна ціни)
    public void updateProductPrice(String name, double newPrice) {
        Product productToUpdate = findProductByName(name);
        if (productToUpdate != null) {
            productToUpdate.setPrice(newPrice);
        } else {
            System.out.println("Товар з назвою " + name + " не знайдений.");
        }
    }
}
