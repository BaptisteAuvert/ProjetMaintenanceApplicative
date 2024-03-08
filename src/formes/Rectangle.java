package formes;

import java.awt.*;

public class Rectangle extends Shape {

    private int l;
    private int L;

    public Rectangle(int x, int y, int inl, int inL, Color color) {
        super(x, y, color);
        l = inl;
        L = inL;
    }

    public void DrawShape(Graphics2D g2d) {
        for (int i = 0; i < l; i += PointC.taillePoint) {
            Point nvp = new Point(p.getX(), p.getY() + i, p.getColor());
            Point nvp2 = new Point(p.getX() + L, p.getY() + i, p.getColor());

            nvp.DrawPoint(g2d);
            nvp2.DrawPoint(g2d);
        }
        for (int y = 0; y < L; y += PointC.taillePoint) {
            Point nvp3 = new Point(p.getX() + y, p.getY() + l, p.getColor());
            Point nvp4 = new Point(p.getX() + y, p.getY(), p.getColor());

            nvp3.DrawPoint(g2d);
            nvp4.DrawPoint(g2d);
        }

    }

    public String toString() {
        return super.toString() + "Rectangle ";
    }
}
