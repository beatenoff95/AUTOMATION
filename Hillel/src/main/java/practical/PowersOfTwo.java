package practical;
import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        // Створюємо об'єкт Scanner для отримання введення від користувача
        Scanner scanner = new Scanner(System.in);

        // Запитуємо користувача ввести число N
        System.out.print("Введіть число N: ");
        int N = scanner.nextInt();

        // Закриваємо Scanner, оскільки вже завершили введення
        scanner.close();

        // Ініціалізуємо змінну для підрахунку ступенів числа 2
        int power = 0;

        // Використовуємо цикл while для виведення ступенів числа 2 до N
        while (power <= N) {
            System.out.println("2^" + power + " = " + (int) Math.pow(2, power));
            power++;
        }
    }
}

