import java.util.Scanner;
import java.util.Random;

// 6.1Найти сумму нечетных элементов массива:
public class SumOfOddElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размер массива: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100);
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }

        System.out.println("Массив: " + Arrays.toString(arr));
        System.out.println("Сумма нечетных элементов массива: " + sum);
    }
}


   //6.2 Найти сумму нечетных элементов массива:

import java.util.Scanner;
        import java.util.Random;
        import java.util.Arrays;

public class SwapFirstAndLastElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размер массива: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.println("Исходный массив: " + Arrays.toString(arr));

        int temp = arr[0];
        arr[0] = arr[size - 1];
        arr[size - 1] = temp;

        System.out.println("Массив после замены первого и последнего элементов: " + Arrays.toString(arr));
    }
}

