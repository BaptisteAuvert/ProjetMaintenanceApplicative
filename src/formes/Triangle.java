package formes;

import java.awt.*;

public class Triangle extends Shape {

    private Point p2;
    private Point p3;

    public Triangle(int inX1, int inY1, int inX2, int inY2, int inX3, int inY3, Color color) {
        super(inX1, inY1, color);
        p2 = new Point(inX2, inY2, color);
        p3 = new Point(inX3, inY3, color);
    }

    public void DrawShape(Graphics2D g2d) {
        g2d.drawLine(p.getX(), p.getY(), p2.getX(), p2.getY());
        g2d.drawLine(p.getX(), p.getY(), p3.getX(), p3.getY());
        g2d.drawLine(p2.getX(), p2.getY(), p3.getX(), p3.getY());
    }

    public String toString() {
        return super.toString() + "Triangle";
    }
}
