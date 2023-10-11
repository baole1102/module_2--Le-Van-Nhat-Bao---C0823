package ss4_OOP.exc;

public class QuadraticEquation {
    private double a ;
    private double b;
    private double c;
    QuadraticEquation (double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    private double getA(){
        return this.a;
    }
    private double getB(){
        return this.b;
    }
    private double getC(){
        return this.c;
    }
    private double getDiscriminant(){
        return (b*b)-4*a*c;
    }
    private double getRoot1(){
        return (-b+Math.sqrt(getDiscriminant()))/(2*a);
    }
    private double getRoot2(){
        return (-b-Math.sqrt(getDiscriminant()))/(2*a);
    }
    public void checkDenta(){
        if (getDiscriminant()>=0){
            System.out.println("The equation has two roots "+ getRoot1() +"and "+getRoot2());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}