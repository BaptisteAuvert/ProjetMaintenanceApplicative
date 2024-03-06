package test;

import javax.swing.*;
import java.awt.*;
import formes.*;
import formes.Rectangle;
import formes.Shape;

public class Test_Rectangle {
    public static void main(String[] args) {
        int w = 300;
        int h = 300;
        JFrame f = new JFrame();
        DrawCanvas dc = new DrawCanvas(w, h); // Utilisation de la classe DrawCanvas

        // Créer un rectangle
        Shape rectangle = new Rectangle(50, 50, 100, 80, Color.blue);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawRect(100, 100, 200, 200); // Dessine un cercle avec son coin supérieur gauche à (100, 100) et un diamètre de 200 pixels
            }
        };

        // Ajouter le rectangle à DrawCanvas
        dc.addNewCalque();
        dc.adShape(rectangle, 0);

        // Ajouter DrawCanvas à la JFrame
        f.add(dc);
        f.add(panel);

        // Configurer la JFrame
        f.setSize(w, h);
        f.setTitle("Test Rectangle");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
