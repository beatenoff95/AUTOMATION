
 import java.util.Scanner;
//TASK 3.1
    public class Circumference {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // ввод радиуса
            System.out.print("Введите радиус окружности: ");
            double radius = scanner.nextDouble();

            // вычисление длины окружности
            double circumference = 2 * Math.PI * radius;

            // вывод результата
            System.out.println("Длина окружности: " + circumference);
        }
//TASK 3.2
        public static class Sinus {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // ввод угла в градусах
                System.out.print("Введите угол в градусах: ");
                double angleDeg = scanner.nextDouble();

                // перевод градусов в радианы
                double angleRad = Math.toRadians(angleDeg);

                // вычисление синуса угла
                double sin = Math.sin(angleRad);

                // вывод результата
                System.out.println("Синус угла: " + sin);
            }
        }
//TASK 3.3
        public static class SPEED {
            public static final double G = 9.81; // ускорение свободного падения (м/с^2)

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите номер этажа: ");
                int floorNumber = scanner.nextInt();
                System.out.print("Введите высоту этажа (м): ");
                double floorHeight = scanner.nextDouble();

                double h = floorNumber * floorHeight;
                double v = Math.sqrt(2 * G * h);

                System.out.println("Скорость удара о землю: " + v + " м/с");
            }
        }
    }


