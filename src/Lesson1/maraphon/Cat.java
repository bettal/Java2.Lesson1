package Lesson1.maraphon;

public class Cat extends Animal {
    public Cat(String name) {
        super("Cat", name, 200, 0, 20);
    }

    @Override
    public void swim(int dist) {
        System.out.println("Коты не плавают!");
    }
}
