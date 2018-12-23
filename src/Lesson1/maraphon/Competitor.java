/**
 * Java.1.Lesson.1.Homework
 *
 * @autor Stanislav Lyashov
 */
package Lesson1.maraphon;

public interface Competitor {
    void run(int dist);

    void swim(int dist);

    void jump(int height);

    boolean isDistance();

    void info();
}
