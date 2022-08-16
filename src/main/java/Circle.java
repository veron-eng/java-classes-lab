public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        double circumference = Math.PI * radius *2 ;
        return circumference;
    }

    /*public setRadius(double radius) {
        this.radius = radius;
    } */

}
