public class triangle {
    private int sideA , sideB;
    public static int counter = 0;
    public int counterForobject = 0;
    public static String className = "triangle";


    public triangle( int sideA, int sideB) {
        setSideA(sideA);
        setSideB(sideB);
        counter++;
        counterForobject++;

    }
    public triangle(Point location, int sideA,int sideB,int side) {
        super(location);
        setSideA(sideA);
        setSideB(sideB);

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
    public void setSideC(int sideC) {
        if (sideC < 0) {
            this.sideC = 0;
            System.out.println("Side C can't be negative!!");
        } else {
            this.sideC = sideC;
    @Override
    public double perimeter(){
        return (sideA + sideB + sideC);
    }
    @Override
    public double area(){
        return sideA * sideB / 2;

    }

    @Override
    public String toString() {
        return "triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", counterForobject=" + counterForobject +
                '}';
    }


}
}
}
