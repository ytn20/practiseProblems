package oops;

public class Rectangle {

    // main OOPs priciple/features - INTERVIEW Q
    // Priciple 1 - Encapsulation (containing all data encapsulated from outer world)
    // We put private here because we say that in Java you should try to always

    double l;
    double b;

    public double area() {
        return l*b;
    }

    // constructors

    public Rectangle(double l, double b){
        this.l = l;
        this.b = b;
    }

    public Rectangle(double l){
        this.l = l;
    }


}
