package animals;

public class AnimalSchool {
    public static void main(String[] args) {
Rabbit rabbit=new Rabbit();
rabbit.run();
 Squirrel    squirrel=new Squirrel();
 squirrel.run();
    }
}

interface Running {
    public void run();
}
interface Swimming { // interface vs abstract class загуглить
    public void swim();
}
interface Climbing {
    public void climb();
}
class Rabbit implements  Running,Swimming{

    @Override
    public void run() {
        System.out.println("rabbit runs");
    }

    @Override
    public void swim() {
        System.out.println("rabbit swims");
    }
}

class Squirrel implements Running,Climbing{

    @Override
    public void run() {
        System.out.println("Squirrel runs");
    }

    @Override
    public void climb() {
        System.out.println("Squirrel climbs");
    }
}