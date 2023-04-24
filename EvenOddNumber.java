import java.util.Scanner;

//4.1. Определение четности числа:
public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число " + number + " является четным.");
        } else {
            System.out.println("Число " + number + " является нечетным.");
        }
    }
    //4.2. Проверка, могут ли три введенных числа быть длинами сторон треугольника:
    public static class TriangleSides {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первую длину стороны: ");
            int a = scanner.nextInt();
            System.out.print("Введите вторую длину стороны: ");
            int b = scanner.nextInt();
            System.out.print("Введите третью длину стороны: ");
            int c = scanner.nextInt();

            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("Длины сторон " + a + ", " + b + " и " + c + " могут быть длинами сторон треугольника.");
            } else {
                System.out.println("Длины сторон " + a + ", " + b + " и " + c + " не могут быть длинами сторон треугольника.");
            }
        }
    }
}


