package test;

import javax.swing.*;
import java.awt.*;
import formes.*;
import formes.Shape;

public class Test_Triangle {
    public static void main(String[] args) {
        int w = 300;
        int h = 300;
        JFrame f = new JFrame();
        DrawCanvas dc = new DrawCanvas(w, h); // Utilisation de la classe DrawCanvas

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int[] xPoints = {150, 250, 200}; // Coordonnées x des sommets du triangle
                int[] yPoints = {100, 100, 300}; // Coordonnées y des sommets du triangle
                int numPoints = 3; // Nombre de sommets du triangle

                g.drawPolygon(xPoints, yPoints, numPoints); // Dessine le triangle avec les points spécifiés
            }
        };



        // Créer un triangle
        Shape triangle = new Triangle(50, 50, 150, 150, 250, 50, Color.green);

        // Ajouter le triangle à DrawCanvas
        dc.addNewCalque();
        dc.adShape(triangle, 0);

        // Ajouter DrawCanvas à la JFrame
        f.add(dc);
        f.add(panel);
        // Configurer la JFrame
        f.setSize(w, h);
        f.setTitle("Test Triangle");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
