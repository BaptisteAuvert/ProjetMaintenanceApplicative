package test;

import formes.*;
import formes.Shape;

import javax.swing.*;
import java.awt.*;

public class Test_Carre {
    public static void main(String[] args) {
        int w = 300;
        int h = 300;
        JFrame f = new JFrame();
        DrawCanvas dc = new DrawCanvas(w, h); // Utilisation de la classe DrawCanvas

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawRect(100, 100, 200, 200); // Dessine un carré de côté 200 pixels, avec son coin supérieur gauche à (100, 100)
            }
        };

        dc.add(panel);

        // Créer une instance de carré et l'ajouter à DrawCanvas
        Shape carre = new Carre(10, 10, 60, Color.black);
        dc.addNewCalque();
        dc.adShape(carre, 0);

        // Ajouter le DrawCanvas à la JFrame
        f.add(dc);
        f.add(panel);

        // Configurer la JFrame
        f.setSize(w, h);
        f.setTitle("Test Draw");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
