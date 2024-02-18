package lessons;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 7);

        System.out.println("Площа кола: " + circle.calculateArea());
        System.out.println("Площа прямокутника: " + rectangle.calculateArea());
        System.out.println("Площа трикутника: " + triangle.calculateArea());
    }
}
