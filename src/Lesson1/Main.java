package Lesson1;

public class Main {

    public static void main(String[] args) {
	Cat cat = new Cat("Barsik", "red", 5);
	cat.setAge(6);
	cat.info();

	Dog dog = new Dog("Tuzuk", "black", 7);
	dog.info();
	dog.run();

	Animal animal = new Cat("Murka", "white", 4);
	((Cat) animal).go();
        //System.out.println(cat instanceof Animal);

    }
}
