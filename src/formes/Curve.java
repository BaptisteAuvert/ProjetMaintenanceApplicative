package formes;

import java.awt.*;


public class Curve extends Shape {
    private Point p1;
    private Point p2;
    private Point p3;

    public Curve(int x, int y, Point p1, Point p2, Point p3, Color col) {
        super(x, y, col);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    // algorithme refactoré du code C
    public static Point calcPointMedian(Point p1, Point p2, double t) {
        double x = p1.getX() * (1 - t) + p2.getX() * t;
        double y = p1.getY() * (1 - t) + p2.getY() * t;
        return new Point((int) x, (int) y, Color.BLACK);
    }

    // algorithme refactoré du code C
    public static Point cjCalc(Point[] points, int num_pt, double t) {
        Point[] tmpPt = new Point[num_pt];
        for (int i = 0; i < num_pt; ++i) {
            tmpPt[i] = points[i];
        }
        for (int i = num_pt - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                tmpPt[j] = calcPointMedian(tmpPt[j], tmpPt[j + 1], t);
            }
        }
        return tmpPt[0];
    }

    public void DrawShape(Graphics2D g2d) {
        Point[] points = {p, p1, p2, p3};
        int num_pt = points.length;

        for (double t = 0; t < 1.0; t = t + 0.0001) {
            Point cjp1 = cjCalc(points, num_pt, t);
            Point pt = new Point(cjp1.getX(), cjp1.getY(), Color.BLACK);
            pt.DrawPoint(g2d);
        }
    }
}