public class Circle extends  Shape{

    private Point center;
    private int radius;


    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius < 0){
            throw new IllegalArgumentException("radius can not be negative!!");
        }else {
            this.radius = radius;

        }
    }

    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + this.center +
                ", radius=" + this.radius +
                '}';
    }

}
