public class Main {
    public static void main(String[] args) {
/*
        Point p1 = new Point();
        String s1 = new String( "Ali");

        System.out.println(p1.xCoord);
        System.out.println(p1.yCoord);

        Point p2 = new Point(3 ,4);
        System.out.println(p2.xCoord);
        System.out.println(p2.yCoord);

        Point p3 = new Point(5);
        System.out.println(p3.xCoord);
        System.out.println(p3.yCoord);

        Point tLeft = new Point(3 ,4);
        Rectangle r1 = new Rectangle(
                tLeft,
                3,
                4
        );
        System.out.println(r1.getSideA());
        System.out.println(r1.getSideB());
        System.out.println(r1.getTopLeft().xCoord);
        System.out.println(r1.getTopLeft().yCoord);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());

        Circle c1 = new Circle(
                new Point(3,4),
                5
        );
        System.out.println(c1.getRadius());

        c1.setRadius(-21);
        System.out.println(c1.getRadius());

        Point p = new Point(3,4);
        Rectangle r1 = new Rectangle(p,3,4);
        System.out.println(r1.counterForobject);
        System.out.println(Rectangle.counter);
        Rectangle r2 = new Rectangle(p,5,6);
        System.out.println(r1.counterForobject);
        System.out.println(r2.counterForobject);
        System.out.println(Rectangle.counter);
        System.out.println(Integer.max(3,4));
        System.out.println(Integer.parseInt("2"));
        String a = new String("aaa");
        System.out.println(a);
        System.out.println(r1);
*/
        Rectangle r = new Rectangle(new Point(3,4),5,6);
        System.out.println(r.getLocation());
        System.out.println(r);
        System.out.println(r.perimeter());
        System.out.println(r.area());
        Circle c = new Circle(new Point(3,4));
        System.out.println(c);
        System.out.println(c.area());
        System.out.println(c.perimeter());
    }
}