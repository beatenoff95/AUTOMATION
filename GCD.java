//5.1 Вычислить сумму четных чисел между N1 и N2.
import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N1: ");
        int n1 = scanner.nextInt();
        System.out.print("Введите N2: ");
        int n2 = scanner.nextInt();
        int sum = 0;
        for (int i = n1; i <= n2; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма четных чисел между " + n1 + " и " + n2 + " = " + sum);
    }
}

//5.2 Найти наибольший общий делитель N1 и N2 (алгоритм Эвклида).


public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N1: ");
        int n1 = scanner.nextInt();
        System.out.print("Введите N2: ");
        int n2 = scanner.nextInt();
        int gcd = n1;
        while (n2 != 0) {
            int temp = n2;
            n2 = gcd % n2;
            gcd = temp;
        }
        System.out.println("НОД " + n1 + " и " + n2 + " = " + gcd);
    }
}

//5.3. Найти количество цифр в числе (не конвертировать в строку).

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        System.out.println("Количество цифр в числе: " + count);
    }
}

