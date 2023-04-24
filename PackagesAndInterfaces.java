// Определяем интерфейс IVoice
interface IVoice {
    void makeSound();
}

// Определяем интерфейс IMove
interface IMove {
    void start();
    void stop();
}

// Определяем абстрактный класс Animal
abstract class Animal implements IVoice, IMove {
    protected String name;
    protected int age;
    protected String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }
}

// Определяем класс Cat, наследующий класс Animal
class Cat extends Animal {
    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу");
    }

    @Override
    public void start() {
        System.out.println("Кот начал бегать");
    }

    @Override
    public void stop() {
        System.out.println("Кот остановился");
    }
}

// Определяем класс Bird, наследующий класс Animal
class Bird extends Animal {
    public Bird(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void makeSound() {
        System.out.println("Чик-чирик");
    }

    @Override
    public void start() {
        System.out.println("Птица полетела");
    }

    @Override
    public void stop() {
        System.out.println("Птица приземлилась");
    }
}

// Определяем класс Fish, наследующий класс Animal
class Fish extends Animal {
    public Fish(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void makeSound() {
        System.out.println("...");
    }

    @Override
    public void start() {
        System.out.println("Рыба начала плавать");
    }

    @Override
    public void stop() {
        System.out.println("Рыба остановилась");
    }
}

//В этом коде определены интерфейсы IVoice и IMove, абстрактный класс Animal и три класса-наследника: Cat, Bird и Fish.
//Класс Animal является абстрактным и содержит три поля: name, age и color.
// Он реализует оба интерфейса IVoice и IMove, но методы не имеют конкретной реализации и должны быть переопределены
// в классах-наследниках. Классы-наследники (Cat, Bird и Fish) имеют конструкторы, которые вызывают конструктор суперкласса Animal.
// Каждый из этих классов также переопределяет методы интерфейсов IVoice и IMove, реализуя IVoice и IMove для классов наследников Animal:


public abstract class Animal {
    private String name;
    private int age;
    private String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void move();

    public abstract void stop();

    public abstract void voice();
}

public class Cat extends Animal implements IMove, IVoice {
    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void move() {
        System.out.println("Cat is walking");
    }

    @Override
    public void stop() {
        System.out.println("Cat stops walking");
    }

    @Override
    public void voice() {
        System.out.println("Meow");
    }

    @Override
    public void start() {
        System.out.println("Cat starts running");
    }

    @Override
    public void stopMove() {
        System.out.println("Cat stops running");
    }
}

public class Dog extends Animal implements IMove, IVoice {
    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void move() {
        System.out.println("Dog is running");
    }

    @Override
    public void stop() {
        System.out.println("Dog stops running");
    }

    @Override
    public void voice() {
        System.out.println("Woof");
    }

    @Override
    public void start() {
        System.out.println("Dog starts barking");
    }

    @Override
    public void stopMove() {
        System.out.println("Dog stops barking");
    }
}

