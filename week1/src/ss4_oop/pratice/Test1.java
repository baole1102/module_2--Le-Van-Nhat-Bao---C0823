package ss4_oop.pratice;

public class Test1 {
    public static void main(String[] args) {
       Geometric human = new Geometric("Bao",23,1.7);
        System.out.println(human.setName("Hong"));
        Inheritance human1 = new Inheritance("Bao",29,1.7,2);
        System.out.println(human1.getId());
        System.out.println(human1.toString());
    }
}
