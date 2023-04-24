//1 Variables
public class Variables {
    public static void main(String[] args) {
        int age = 30; //целочисленная переменная
        double weight = 65.5; //переменная с плавающей точкой
        boolean isStudent = true; //логическая переменная
        char gender = 'M'; //символьная переменная

        System.out.println("Мой возраст: " + age);
        System.out.println("Мой вес: " + weight);
        System.out.println("Я студент: " + isStudent);
        System.out.println("Мой пол: " + gender);

        //попытка присвоения невалидных значений
        age = 0x80000000; //большое значение для типа int
        weight = Double.parseDouble("65.5"); //присвоение строки переменной типа double

        //вывод результатов на экран
        System.out.println("Мой возраст: " + age);
        System.out.println("Мой вес: " + weight);
    }
//2 Types
    public static class DataTypes {
        public static void main(String[] args) {
            //целочисленные типы данных
            byte b = 127;
            short s = 32767;
            int i = 2147483647;
            long l = 9223372036854775807L;

            //числа с плавающей точкой
            float f = 3.14f;
            double d = 3.141592653589793238;

            //логический тип данных
            boolean bool = true;

            //символьный тип данных
            char c = 'A';

            //вывод значений переменных на экран
            System.out.println("byte: " + b);
            System.out.println("short: " + s);
            System.out.println("int: " + i);
            System.out.println("long: " + l);
            System.out.println("float: " + f);
            System.out.println("double: " + d);
            System.out.println("boolean: " + bool);
            System.out.println("char: " + c);

            //попытка присвоения невалидных значений
            b = (byte) 129; //большое значение для типа byte
            s = (short) 32768; //большое значение для типа short
            i = 2147483648; //большое значение для типа int
            l = 9223372036854775808L; //большое значение для типа long
            f = 3.141592653589793
            //вывод значений переменных на экран после изменений
            System.out.println("byte: " + b);
            System.out.println("short: " + s);
            System.out.println("int: " + i);
            System.out.println("long: " + l);
            System.out.println("float: " + f);
            System.out.println("char: " + c);
        }
    }
}



