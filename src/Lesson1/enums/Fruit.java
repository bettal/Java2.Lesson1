package Lesson1.enums;

public enum Fruit {
    Orange(150), Apple(200), Banana, Chery;
    private int weigth;

    Fruit (int weigth) {
        this.weigth = weigth;
    }

    Fruit () {
        this.weigth = -1;
    }

    public int getWeigth() {
        return weigth;
    }
}
