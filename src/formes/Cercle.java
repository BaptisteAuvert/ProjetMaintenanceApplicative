package formes;

import java.awt.*;

public class Cercle extends Shape {
    private int rayon;

    public Cercle(int inX, int inY, int r, Color color) {
        super(inX, inY, color);
        rayon = r * PointC.taillePoint;
    }

    public void DrawShape(Graphics2D g2d) {
        // algorithme refactoré du code C
        int x = 0;
        int y = rayon;
        int d = rayon - 1;

        while (y >= x) {
            Point pt1 = new Point(p.getX() + x, p.getY() + y, p.getColor());
            Point pt2 = new Point(p.getX() + y, p.getY() + x, p.getColor());

            Point pt3 = new Point(p.getX() - x, p.getY() + y, p.getColor());
            Point pt4 = new Point(p.getX() - y, p.getY() + x, p.getColor());

            Point pt5 = new Point(p.getX() + x, p.getY() - y, p.getColor());
            Point pt6 = new Point(p.getX() + y, p.getY() - x, p.getColor());

            Point pt7 = new Point(p.getX() - x, p.getY() - y, p.getColor());
            Point pt8 = new Point(p.getX() - y, p.getY() - x, p.getColor());

            pt1.DrawPoint(g2d);
            pt2.DrawPoint(g2d);
            pt3.DrawPoint(g2d);
            pt4.DrawPoint(g2d);
            pt5.DrawPoint(g2d);
            pt6.DrawPoint(g2d);
            pt7.DrawPoint(g2d);
            pt8.DrawPoint(g2d);


            if (d >= 2 * x) {
                d -= 2 * x + 1;
                x += PointC.taillePoint;
            } else if (d < 2 * (rayon - y)) {
                d += 2 * y - 1;
                y -= PointC.taillePoint;
            } else {
                d += 2 * (y - x - 1);
                y -= PointC.taillePoint;
                x += PointC.taillePoint;
            }
        }
    }

    public String toString() {
        return super.toString() + "Cercle";
    }
}
