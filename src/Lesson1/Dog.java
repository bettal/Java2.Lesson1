package Lesson1;

public class Dog extends Animal implements MyInterface{
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    void voice() {
        System.out.println("Гав!");
    }

    @Override
    public void run() {
        System.out.println("Собака Бежит");
    }
}
