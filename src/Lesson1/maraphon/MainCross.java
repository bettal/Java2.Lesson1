/**
 * Java.1.Lesson.1.Homework
 *
 * @autor Stanislav Lyashov
 */

package Lesson1.maraphon;

public class MainCross {
    public static void main(String[] args) {
        Competitor[] competitors = {new Human("Kirk"), new Cat("Sher"), new Dog("Rex")};
        Obstacle[] obstacles = {new Cross(80), new Wall(5),new Water(3)};
        for (Competitor c: competitors){
            for (Obstacle o: obstacles){
                o.doIt(c);
                if (!c.isDistance()){
                    break;
                }
            }
        }
        for (Competitor c: competitors){
            c.info();
        }
    }
}
