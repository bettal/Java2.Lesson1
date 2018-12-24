/**
 * Java.1.Lesson.1.Homework
 *
 * @autor Stanislav Lyashov
 */
package Lesson1.maraphon;

public class Cross extends Obstacle {
    int lehgth;

    public Cross(int lehgth) {
        this.lehgth = lehgth;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(lehgth);
    }
}
