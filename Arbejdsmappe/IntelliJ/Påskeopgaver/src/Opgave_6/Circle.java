package Opgave_6;

public class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) throws ArithmeticException {

        if(radius < 0){
            throw new ArithmeticException("Det skal være et positivt tal");
        }
        else {
            this.radius = radius;
        }
    }


    public double calculateArea(){
        int radius;
        double area;
        radius = getRadius();

        area = Math.PI *(radius*radius);

        return area;
    }

}
