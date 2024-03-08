package formes;

import java.awt.*;

import static java.lang.Math.abs;

public class Line extends Shape {
    private Point p2;

    public Line(int inX, int inY, int inX2, int inY2, Color color) {
        super(inX, inY, color);
        p2 = new Point(inX2, inY2, p.getColor());
    }

    public void DrawShape(Graphics2D g2D) {
        // algorithme refactoré du code C
        int i, cumul;
        int xinc, yinc;
        int dx = p2.getX();
        int dy = p2.getY();
        xinc = (dx > 0) ? 1 : -1;
        yinc = (dy > 0) ? 1 : -1;
        dx = abs(dx);
        dy = abs(dy);
        int x = p.getX();
        int y = p.getY();

        if (dx > dy) {
            cumul = dx / 2;
            for (i = 1; i <= dx; i++) {
                x += xinc;
                cumul += dy;
                if (cumul >= dx) {
                    cumul -= dx;
                    y += yinc;
                }
                Point nvp = new Point(x, y, p.getColor());
                nvp.DrawPoint(g2D);
            }
        } else {
            cumul = dy / 2;
            for (i = 1; i <= dy; i++) {
                y += yinc;
                cumul += dx;
                if (cumul >= dy) {
                    cumul -= dy;
                    x += xinc;
                }
                Point nvp = new Point(x, y, p.getColor());
                nvp.DrawPoint(g2D);
            }
        }

    }

    public String toString() {
        return super.toString() + "Line";
    }
}
