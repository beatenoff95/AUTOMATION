//Для решения данной задачи необходимо создать классы для каждого типа транспорта
// (автомобиль, мотоцикл, велосипед) и класс для парковки.

public abstract class Vehicle {
    private String owner;
    private String model;
    private String color;
    private Date enterTime;

    public Vehicle(String owner, String model, String color) {
        this.owner = owner;
        this.model = model;
        this.color = color;
        this.enterTime = new Date();
    }

    public String getOwner() {
        return owner;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Date getEnterTime() {
        return enterTime;
    }

    public abstract String getType();

    public abstract String getNumber();

    @Override
    public String toString() {
        return getType() + " (" + getNumber() + ") - " + owner + ", " + model + ", " + color + ", " + enterTime;
    }
}

public class Car extends Vehicle {
    private String number;

    public Car(String owner, String model, String color, String number) {
        super(owner, model, color);
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public String getType() {
        return "Car";
    }
}

public class Motorcycle extends Vehicle {
    private String number;

    public Motorcycle(String owner, String model, String color, String number) {
        super(owner, model, color);
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public String getType() {
        return "Motorcycle";
    }
}

public class Bicycle extends Vehicle {
    public Bicycle(String owner, String model, String color) {
        super(owner, model, color);
    }

    public String getType() {
        return "Bicycle";
    }

    public String getNumber() {
        return "";
    }
}

public class ParkingLot {
    private int maxCars;
    private int maxMotorcycles;
    private int maxBicycles;
    private List<Vehicle> parkedVehicles;

    public ParkingLot(int maxCars, int maxMotorcycles, int maxBicycles) {
        this.maxCars = maxCars;
        this.maxMotorcycles = maxMotorcycles;
        this.maxBicycles = maxBicycles;
        this.parkedVehicles = new ArrayList<>();
    }

    public boolean parkVehicle(Vehicle vehicle) {
        if (vehicle instanceof Car && parkedVehicles.stream().filter(v -> v instanceof Car).count() >= maxCars) {
            System.out.println("No available parking spots for cars");
            return false;
        }

        if (vehicle instanceof Motorcycle && parkedVehicles.stream().filter(v -> v instanceof Motorcycle).count() >= maxMotorcycles) {
            System.out.println("No available parking spots for motorcycles");
            return false;
        }

        if (vehicle instanceof Bicycle && parkedVehicles.stream().filter(v -> v instanceof Bicycle).count() >= maxBicycles) {
            System.out.println("No available parking spots for bicycles");
            return false;
        }

        parkedVehicles.add(vehicle);
        return true;
    }

    public void printParkedVehicles() {
        System.out.println("Parked vehicles:");
        parkedVehicles.forEach(System.out::println);
    }

    public List<Vehicle> getParkedVehicles() {
        return parkedVehicles;
    }
}

//Пример использования:

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Parking parking = new Parking();

        // Создание транспорта
        Car car1 = new Car("A123BC", "John Smith", "Toyota", "blue", System.currentTimeMillis());
        Car car2 = new Car("B456DE", "Kate Brown", "Honda", "red", System.currentTimeMillis());
        Motorcycle motorcycle1 = new Motorcycle("C789FG", "Peter White", "Harley Davidson", "black", System.currentTimeMillis());
        Bicycle bicycle1 = new Bicycle("Mike Green", "GT", "green", System.currentTimeMillis());

        // Парковка транспорта
        parking.parkVehicle(car1);
        parking.parkVehicle(car2);
        parking.parkVehicle(motorcycle1);
        parking.parkVehicle(bicycle1);

        // Отчет о парковке
        System.out.println("Отчет о парковке:\n" + parking.generateReport());

        // Освобождение места на парковке
        parking.removeVehicle(car1);
        parking.removeVehicle(motorcycle1);

        // Отчет о парковке после освобождения места
        System.out.println("Отчет о парковке после освобождения места:\n" + parking.generateReport());
    }
}
