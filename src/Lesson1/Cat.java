package Lesson1;

public class Cat {
    String name;
    String color;
    int age;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = getAge();

    }

    public void info(){
        System.out.println( name + " " + color + " " + age );
    }

    public int getAge(){
        return age;
    };
    public void setAge(int age) {
        if(age >=0) {
            this.age = age;
        }else{
            System.out.println("Возрасть не можеть меньше нуля!");
        }
    }
}
