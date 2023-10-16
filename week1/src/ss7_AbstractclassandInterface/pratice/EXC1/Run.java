package ss7_AbstractclassandInterface.pratice.EXC1;

import ss7_AbstractclassandInterface.pratice.EXC1.animal.Animal;
import ss7_AbstractclassandInterface.pratice.EXC1.animal.Chicken;
import ss7_AbstractclassandInterface.pratice.EXC1.animal.Tiger;
import ss7_AbstractclassandInterface.pratice.EXC1.edible.Edible;
import ss7_AbstractclassandInterface.pratice.EXC1.fruit.Apple;
import ss7_AbstractclassandInterface.pratice.EXC1.fruit.Fruit;
import ss7_AbstractclassandInterface.pratice.EXC1.fruit.Orange;

public class Run {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        Animal tiger = new Tiger();
        System.out.println(chicken.makeSound());
        System.out.println(tiger.makeSound());
        Edible edibler = chicken;
        System.out.println(edibler.howtoEat());


        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits){
            System.out.println(fruit.howtoEat());
        }
    }
}
