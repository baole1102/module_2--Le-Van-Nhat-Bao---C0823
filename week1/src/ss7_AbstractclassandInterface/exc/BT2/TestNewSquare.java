package ss7_AbstractclassandInterface.exc.BT2;

import ss7_AbstractclassandInterface.exc.BT1.Resizeable;
import ss7_AbstractclassandInterface.exc.BT1.Square;

import java.awt.*;

public class TestNewSquare {
    public static void main(String[] args) {
        NewSquare[] newSquare = new NewSquare[2];
        newSquare [0] = new NewSquare(5);
        newSquare [1] = new NewSquare();
        for (NewSquare square : newSquare){
            System.out.println(square.getArea());
            if (square instanceof Colorable){
                System.out.println(((Colorable)square).howToColor());
            }
        }

//        for (int i =0 ; i < newSquare.length; i++){
//            if (newSquare[i] instanceof Square ){
//                System.out.println(newSquare[i].getArea());
//            }
//           if (newSquare [i] instanceof Colorable){
//               System.out.println(newSquare[i].howToColor());
//           }
//        }
    }
}
