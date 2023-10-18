package ss7_abstractclassandInterface.pratice.EXC1.animal;

import ss7_abstractclassandInterface.pratice.EXC1.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howtoEat(){
        return "could be fried";
    }
}
