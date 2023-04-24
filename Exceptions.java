import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число A: ");
        double a = scanner.nextDouble();
        scanner.close();

        try {
            if (a < 0) {
                throw new Exception("Корень из отрицательного числа невозможен");
            }
            double result = Math.sqrt(a);
            System.out.printf("Квадратный корень из %.2f равен %.2f\n", a, result);
        } catch (Exception e) {
            System.out.println(e.getMessage() + ". Результат в комплексной форме: " + Math.sqrt(-a) + "i");
        }
    }
}
