/**
 * Java.1.Lesson.1.Homework
 *
 * @autor Stanislav Lyashov
 */
package Lesson1.maraphon;

public class Animal implements Competitor {
    String type;
    String name;

    int maxRunDistabce;
    int maxSwimDistabce;
    int maxJumpDistabce;

    boolean onDistance;

    public Animal(String type, String name, int maxRunDistabce, int maxSwimDistabce, int maxJumpDistabce) {
        this.type = type;
        this.name = name;
        this.maxRunDistabce = maxRunDistabce;
        this.maxSwimDistabce = maxSwimDistabce;
        this.maxJumpDistabce = maxJumpDistabce;
        this.onDistance = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistabce) {
            System.out.println(type + " " + name + " успешно пробежал");
        } else {
            System.out.println(type + " " + name + " провалил");
            onDistance = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (dist <= maxSwimDistabce) {
            System.out.println(type + " " + name + " успешно проплыл");
        } else {
            System.out.println(type + " " + name + " провалил");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpDistabce) {
            System.out.println(type + " " + name + " успешно прыгнул");
        } else {
            System.out.println(type + " " + name + " провалил");
            onDistance = false;
        }
    }

    @Override
    public boolean isDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(type + " " + name + " " + onDistance);
    }
}
