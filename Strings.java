import java.util.Scanner;


// 9.1 Определить, содержит ли строка цифры. Сами цифры выводить не надо.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();

        boolean containsDigits = false;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                containsDigits = true;
                break;
            }
        }

        if (containsDigits) {
            System.out.println("Строка содержит цифры.");
        } else {
            System.out.println("Строка не содержит цифр.");
        }
    }
}

//9.2 С клавиатуры вводится строка и символ.
// Вывести все позиции в строке, где находится указанный символ. Если такого символа в строке нет вывести -1.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        System.out.print("Введите символ: ");
        char symbol = scanner.next().charAt(0);

        boolean foundSymbol = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbol) {
                System.out.println("Символ найден в позиции " + i);
                foundSymbol = true;
            }
        }

        if (!foundSymbol) {
            System.out.println("Символ не найден.");
        }
    }
}
