package lesson13;

import java.util.Date;

public class Product {
    private String name;
    private String countryOfOrigin;
    private Date manufacturingDate;
    private double price;

    public Product(String name, String countryOfOrigin, Date manufacturingDate, double price) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.manufacturingDate = manufacturingDate;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


