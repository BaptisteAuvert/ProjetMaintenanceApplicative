package test;

import javax.swing.*;
import java.awt.*;
import formes.*;
import formes.Point;

public class Test_Point {
    public static void main(String[] args) {
        int w = 300;
        int h = 300;
        JFrame f = new JFrame();
        DrawCanvas dc = new DrawCanvas(w, h); // Utilisation de la classe DrawCanvas

        // Créer un point
        Point point = new Point(50, 50);

        // Ajouter le point à DrawCanvas
        dc.addNewCalque();
        //dc.adShape(point, 0);

        // Ajouter DrawCanvas à la JFrame
        f.add(dc);

        // Configurer la JFrame
        f.setSize(w, h);
        f.setTitle("Test Point");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
