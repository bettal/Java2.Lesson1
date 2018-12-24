/**
 * Java.1.Lesson.1.Homework
 *
 * @autor Stanislav Lyashov
 */
package Lesson1.maraphon;

public class Water extends Obstacle {
    int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(length);
    }
}
