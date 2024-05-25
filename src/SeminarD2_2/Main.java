package SeminarD2_2;

public class Main {
    public static void main(String[] args) {
        Runner[] runners = {
                new Cat("Барсик", 1500, 300),
                new Cat("Персик", 1700, 220),

                new Human("Вася", 2500, 120),
                new Human("Петя", 3500, 150),

                new Robot("РНР", 999999, 0),
                new Robot("МРВ", 5000, 20)
        };
        Obstacle[] obstacles = {
                new Track(1200),
                new Wall(30),
                new Track(1300),
                new Wall(140),
                new Track(2000),
                new Wall(250)
        };
        for (Runner runner: runners){
            for (Obstacle obstacle: obstacles){
                if(obstacle instanceof Track){
                    if(!runner.run(obstacle.getLenght()))
                        break;
                }
                else if(obstacle instanceof Wall){
                    if(!runner.jump(obstacle.getHeight()))
                        break;
                }
            }
        }
    }
}
