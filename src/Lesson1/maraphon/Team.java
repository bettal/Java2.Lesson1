package Lesson1.maraphon;


public class Team {

    public Competitor[] competitors = {new Human("Kirk"), new Cat("Sher"), new Dog("Rex")};
    public Obstacle[] obstacles = {new Cross(80), new Wall(5),new Water(30)};
    public void team(){
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
