package Lesson1.enums;

public class Main {
    public static void main(String[] args) {
        Fruit fruit = Fruit.Chery;
        System.out.println(fruit.ordinal());
        for (Fruit f: Fruit.values()){
            System.out.println(f);

        }
    }
}
