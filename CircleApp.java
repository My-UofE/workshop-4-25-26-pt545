public class CircleApp{
    public static void main( String[] args ) {

        Circle circle1 = new Circle(2,2,3);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle();
        Circle circle4 = new Circle(1,10,0);

        System.out.println("getRadius "+circle1.getRadius());
        System.out.println("getOriginX "+circle1.getOriginX());
        System.out.println("getOriginY "+circle1.getOriginY());
        System.out.println("getArea " + circle1.getArea());
        System.out.println("getCircumference " + circle1.getCircumference());

        circle4.setRadius(3);
        circle4.setOriginX(8);
        circle4.setOriginY(6);
        System.out.println("setRadius, setOriginX, setOriginY "+ circle4.toString());


        circle3.move(1,1);
        System.out.println("move "+ circle3.toString());
        circle3.scale(2);
        System.out.println("scale "+ circle3.toString());

        System.out.println("isOverlappedWith " + circle1.isOverlappedWith(circle2));
        System.out.println("isOverlappedWith " + circle1.isOverlappedWith(circle3));
        System.out.println("isOverlappedWith " + circle1.isOverlappedWith(circle4));

        System.out.println("isEnclosedBy " + circle3.isEnclosedBy(circle2));
        System.out.println("isEnclosedBy " + circle1.isEnclosedBy(circle2));

    }
}