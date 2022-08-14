public class Circle {
    double radius;
    public Circle(){
        this.radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, boolean filled, String color){
        super();
        this.radius = radius;
    }
    public double getRadius(){
        return Math.PI * this.radius*this.radius;
    }
    public double getPeri(){
        return this.radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle{" +
                "radius=" + radius +
                '}';
    }
}