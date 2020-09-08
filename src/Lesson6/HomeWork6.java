package Lesson6;

    abstract class Animal {
    private final int MAX_RUN_LENGTH = 0;
    private final int MAX_SWIM_LENGTH = 0;


    abstract void run(int length);
    abstract void swim(int length);
    private int count = 0;


}

class Cat extends Animal {
    private final int MAX_RUN_LENGTH = 200;
    private final int MAX_SWIM_LENGTH = 0;


    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("Кот пробежал: " + length + "м");
        else System.out.println("run: false");
    }

    @Override
    void swim(int length) {
        System.out.println("Кот не умеет плавать");
    }

}

class Dog extends Animal {
    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIM_LENGTH = 10;


    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("Бобик пробежал: " + length + "м");
    }

    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= MAX_SWIM_LENGTH)) System.out.println("Бобик проплыл: " + length + "м");
        else System.out.println("Бобик утонул");
    }

}

public class HomeWork6 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run(155);
        cat.swim(3);

        Dog dog = new Dog();
        dog.run(400);
        dog.swim(9);

    }
}