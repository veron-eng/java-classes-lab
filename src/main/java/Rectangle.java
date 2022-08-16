public class Rectangle {

    double length;
    double width;

    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }


    public double getPerimeter(){
        double perimeter = length*2 + width*2;
        return perimeter;
    }

    double area = length*width;
    public double getArea(){

        return area;
    }

    public double getDiagonal(){
        double diagonal = Math.sqrt(area);
        return diagonal;
    }

}
