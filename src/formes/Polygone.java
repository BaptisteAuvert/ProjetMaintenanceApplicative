package formes;

import java.awt.*;
import java.util.ArrayList;

public class Polygone extends Shape {

    // besoin d'une liste pour stocker n points
    private ArrayList<Point> points = new ArrayList<>();

    public Polygone(ArrayList<Integer> inPoints, Color color) throws Exception {
        // à cause de l'héritage d'un seul point de Shape
        super(inPoints.get(0) * PointC.taillePoint, inPoints.get(1) * PointC.taillePoint, color);
        points.add(p);

        // si jamais on ne donne que la moitié des coordonnées du dernier point par maladresse
        // ou bien si on ne donne <3 points (pas un polygone)
        if (inPoints.size() % 2 != 0 || inPoints.size() < 3) {
            throw new Exception("Polygone invalide");
        }

        // rajout des autres points
        for (int i = 3; i < inPoints.size(); i += 2)
            points.add(new Point(inPoints.get(i - 1) * PointC.taillePoint, inPoints.get(i) * PointC.taillePoint, p.getColor()));
    }

    public void DrawShape(Graphics2D g2d) {
        // relier tous les points
        for (int i = 1; i < points.size(); i++) {
            Point p1 = points.get(i - 1);
            Point p2 = points.get(i);
            int dx, dy, x, y;
            x = p1.getX();
            y = p1.getY();
            dx = p2.getX() - p1.getX();
            dy = p2.getY() - p1.getY();
            Line ln = new Line(x, y, dx, dy, p.getColor());
            ln.DrawShape(g2d);
        }

        // relier le dernier au premier point
        Point p1 = points.get(0);
        Point p2 = points.get(points.size() - 1);
        int dx, dy, x, y;
        x = p1.getX();
        y = p1.getY();
        dx = p2.getX() - p1.getX();
        dy = p2.getY() - p1.getY();
        Line ln2 = new Line(x, y, dx, dy, p.getColor());
        ln2.DrawShape(g2d);
    }

    public String toString() {
        return super.toString() + "Polygone";
    }
}
