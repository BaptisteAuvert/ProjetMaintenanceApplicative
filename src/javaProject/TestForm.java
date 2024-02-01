public class TestForm{
    public static void main(String[] args) {
        System.out.println("********************************************************************");
        System.out.println("testPoint");
        TestPoint();

        System.out.println("********************************************************************");
        System.out.println("TestRectangle");
        TestRectangle();

        System.out.println("********************************************************************");
        System.out.println("TestLine");
        TestLine();

        System.out.println("********************************************************************");
        System.out.println("TestCircle");
        TestCircle();

        System.out.println("********************************************************************");
        System.out.println("TestSquare");
        TestSquare();


      }

    private static void TestPoint(){
        Point point = new Point(10,10);
        System.out.println(point);
    }
    private static void TestRectangle(){
        Rectangle rectangle = new Rectangle(new Point(10,10),10,5);
        System.out.println(rectangle);
    }
    private static void TestLine(){
        Line line = new Line (new Point(10,10),new Point(20,15));
        System.out.println(line);
    }
    private static void TestCircle(){
        Circle circle = new Circle(new Point(10,10),14);
        System.out.println(circle);
    }
    private static void TestSquare(){
        Square square = new Square(new Point(10,10),10);
        System.out.println(square);
    }

}