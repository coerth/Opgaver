package Opgave_6;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(20);
        circle.setRadius(30);

        System.out.println("Arealet er: "+ circle.calculateArea());
    }
}
