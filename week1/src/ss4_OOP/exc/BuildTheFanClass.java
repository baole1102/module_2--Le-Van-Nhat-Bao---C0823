package ss4_OOP.exc;

public class BuildTheFanClass {
    public static void main(String[] args) {
        TheFan fan1 = new TheFan();
        TheFan fan2 = new TheFan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn();
        fan2.setSpeed(1);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOff();
        System.out.println("fan1: "+fan1);
        System.out.println("fan2: "+fan2);
    }
}
