
public class Rectangle extends Shape{

    private int sideA , sideB;
    public static int counter = 0;
    public int counterForobject = 0;
    public static String className = "rectangle";


    public Rectangle( int sideA, int sideB) {
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideB);
        counter++;
        counterForobject++;

    }
    public Rectangle(Point location, int sideA,int sideB) {
        super(location);
        setSideA(sideA);
        setSideB(sideA);

    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA < 0){
            throw new IllegalArgumentException("side A can not be negative!!");

        }
        else {
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 0) {
            this.sideB = 0;
            System.out.println("Side B can't be negative!!");
        } else {
            this.sideB = sideB;
        }
    }
    @Override
    public double perimeter(){
        return * 2 ( sideA + sideB);
    }
    @Override
    public double area(){
        return sideA * sideB;

    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", counterForobject=" + counterForobject +
                '}';
    }


    }
}
