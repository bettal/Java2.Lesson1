package Lesson1;

public interface JumpInterface extends MyInterface {
    void jump();
    default void superjump (){
        System.out.println("Супер прыжок!");
    }
}
