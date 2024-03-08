package formes;

import java.awt.*;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class Point {
    private int x;
    private int y;
    private Color color;
    private Object form;
    private int tailleP = PointC.taillePoint;

    public Point(int inX, int inY, Color col) {
        x = inX;
        y = inY;
        color = col;
    }

    public void DrawPoint(Graphics2D g2d) {
        g2d.setColor(color);
        if (PointC.type == "CARRE") {
            form = new Rectangle2D.Double(x + tailleP, y + tailleP, tailleP, tailleP);
            g2d.fill((Shape) form);
        } else if (PointC.type == "CROIX") {
            g2d.drawLine(x - tailleP / 2, y - tailleP / 2, x + tailleP / 2, y + tailleP / 2);
            g2d.drawLine(x + tailleP / 2, y - tailleP / 2, x - tailleP / 2, y + tailleP / 2);
        }
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Color getColor() {
        return color;
    }

    public String toString() {
        return "\n Point: x: " + x + ", y: " + y;
    }
}
