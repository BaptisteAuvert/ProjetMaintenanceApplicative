public class TestLayer{
    public static void main(String[] args) {
        Layer layer = new Layer ();
        System.out.println("Affiche List**********************************************************");
        System.out.println(layer);

        Point point = new Point(10,10);
        Rectangle rectangle = new Rectangle(new Point(10,10),10,5);
        Line line = new Line (new Point(10,10),new Point(20,15));
        Circle circle = new Circle(new Point(10,10),14);
        Square square = new Square(new Point(10,10),10);
        
        layer.addShape(point);
        layer.addShape(rectangle);
        layer.addShape(line);
        layer.addShape(circle);
        layer.addShape(square);

        System.out.println("Affiche List whith added Shape**********************************************************");
        System.out.println(layer);

        System.out.println("getList **********************************************************");
        System.out.println(layer.getList());
        layer.removeShape(2);
        System.out.println("List But shape 2 has been Remove**********************************************************");
        System.out.println(layer.getList());
      }
}