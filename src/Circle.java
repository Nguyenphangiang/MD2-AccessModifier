public class Circle {
    double radius = 1.0;
    String color = "red";

    void Circle(){

    }
    public Circle(double r){
        this.radius=r;
    }
      double getRadius(){
        return this.radius;
    }
      double getArea(){
        double area = Math.pow(this.radius,2) * Math.PI;
        return area;
    }
}
