package Lesson1.maraphon;

public class Human implements Competitor {
    String name;

    int maxRunDistabce;
    int maxSwimDistabce;
    int maxJumpDistabce;

    boolean active;

    public Human(String name) {
        this.name = name;
        this.maxRunDistabce = 5000;
        this.maxSwimDistabce = 200;
        this.maxJumpDistabce = 30;
        this.active = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistabce) {
            System.out.println("Human" + " " + name + " успешно пробежал");
        } else {
            System.out.println("Human" + " " + name + " провалил");
            active = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (dist <= maxSwimDistabce) {
            System.out.println("Human" + " " + name + " успешно проплыл");
        } else {
            System.out.println("Human" + " " + name + " провалил");
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpDistabce) {
            System.out.println("Human" + " " + name + " успешно перепрыгнул");
        } else {
            System.out.println("Human" + " " + name + " провалил");
            active = false;
        }
    }

    @Override
    public boolean isDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println("Human" + " " + name + " " + active);
    }
}
