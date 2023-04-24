//В консоли, в отдельных строках, ввести целые числа и поместить их в ArrayList. Для окончания ввода ввести знак равенства.
// Предусмотреть проверку корректности ввода с помощью обработки исключений. Вычислить сумму введенных чисел и вывести в консоль.
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayListSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Введите целые числа:");
        try {
            while (true) {
                int num = scanner.nextInt();
                list.add(num);
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода. Введено нецелое число.");
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }

        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Сумма введенных чисел: " + sum);
    }
}

//8.2 В консоли ввести N строк, число N задать константой на своё усмотрение.
// Сохранить введенные строки в ArrayList. Отсортировать строки в коллекции и вывести в консоль.
import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Scanner;

public class ArrayListSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        final int N = 5; // задаем количество строк

        System.out.println("Введите " + N + " строк:");
        for (int i = 0; i < N; i++) {
            String str = scanner.nextLine();
            list.add(str);
        }

        Collections.sort(list); // сортируем строки
        System.out.println("Отсортированный список:");
        for (String str : list) {
            System.out.println(str);
        }
    }
}

//8.2*.То же самое, но сортировку сделать по длине строк, а не стандартную.
import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Comparator;
        import java.util.Scanner;

public class ArrayListSortByLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        final int N = 5; // задаем количество строк

        System.out.println("Введите " + N + " строк:");
        for (int i = 0; i < N; i++) {
            String str = scanner.nextLine();
            list.add(str);
        }

        Collections.sort(list, Comparator.comparingInt(String::length)); // сортируем строки по длине
        System.out.println("Отсортированный список:");
        for (String str : list) {
            System.out.println(str);
        }
    }
}

//SortedSet:Случайным образом сгенерировать 30 чисел в диапазоне от0 до 19.
// Вывести полученный набор в консоль и посчитать количество различных чисел.

import java.util.Random;
        import java.util.SortedSet;
        import java.util.TreeSet;

public class RandomNumbers {

    public static void main(String[] args) {

        SortedSet<Integer> numbers = new TreeSet<>();

        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            int randomNumber = random.nextInt(20);
            numbers.add(randomNumber);
        }

        System.out.println("Generated numbers: " + numbers);
        System.out.println("Number of distinct numbers: " + numbers.size());

    }
}


