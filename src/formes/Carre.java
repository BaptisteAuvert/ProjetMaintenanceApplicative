package formes;

import java.awt.*;

public class Carre extends Shape {
    private int l;

    public Carre(int inX, int inY, int inL, Color color) {
        super(inX, inY, color);
        l = inL;
    }

    public void DrawShape(Graphics2D g2d) {
        for (int i = 0; i < l; i += PointC.taillePoint) {
            Point nvp = new Point(p.getX(), p.getY() + i, p.getColor());
            Point nvp2 = new Point(p.getX() + i, p.getY(), p.getColor());
            Point nvp3 = new Point(p.getX() + l, p.getY() + i, p.getColor());
            Point nvp4 = new Point(p.getX() + i, p.getY() + l, p.getColor());

            nvp.DrawPoint(g2d);
            nvp2.DrawPoint(g2d);
            nvp3.DrawPoint(g2d);
            nvp4.DrawPoint(g2d);
        }
    }

    public String toString() {
        return super.toString() + "Carré";
    }
}
