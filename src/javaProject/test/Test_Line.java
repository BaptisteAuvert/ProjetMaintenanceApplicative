package test;

import formes.*;
import formes.Shape;

import javax.swing.*;
import java.awt.*;

public class Test_Line {
    public static void main(String[] args) {
        int w = 300;
        int h = 300;
        JFrame f = new JFrame();
        DrawCanvas dc = new DrawCanvas(w, h); // Utilisation de la classe DrawCanvas

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawLine(100, 100, 200, 200); // Dessine un cercle avec son coin supérieur gauche à (100, 100) et un diamètre de 200 pixels
            }
        };

        // Créer une ligne
        Shape ligne = new Line(50, 50, 250, 250, Color.red);

        // Ajouter la ligne à DrawCanvas
        dc.addNewCalque();
        dc.adShape(ligne, 0);

        // Ajouter DrawCanvas à la JFrame
        f.add(dc);
        f.add(panel);

        // Configurer la JFrame
        f.setSize(w, h);
        f.setTitle("Test Ligne");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
