package Lesson1.enums;

public enum Fruit {
    Orange("Апельсин",150), Apple("Яблоко",200),
    Banana("Банан", 150), Chery("Вишня", 20);

    private int weigth;
    private String rus;

    Fruit(String rus, int weigth) {
        this.rus = rus;
        this.weigth = weigth;

    }

    Fruit (int weigth) {
        this.weigth = weigth;
    }

    Fruit () {
        this.weigth = -1;
    }

    public int getWeigth() {
        return weigth;
    }

    public String getRus() {
        return rus;
    }
}
