package Simple;

public class SimpleClasses {
    public static void main(String[] args) {
Pen pen=new Pen(Colors.Green);
System.out.println(pen.getColor());
Car car=new Car(Colors.Black);
System.out.println(car.toString());

Mixer mixer=new Mixer();
mixer.setValues(1,5);
System.out.println(mixer.getTemp());
    }
}
