import formes.*;
import formes.Point;
import formes.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        // initialisation de la librairie graphique, résolution changeable au besoin
        int w = 650;
        int h = 400;
        JFrame f = new JFrame();
        DrawCanvas dc = new DrawCanvas(w, h);
        dc.addNewCalque();

        // test du carré
        Shape carre = new Carre(10, 10, 20, Color.BLACK);
        dc.addShape(carre, 0);

        // test du rectangle
        Shape rt = new formes.Rectangle(0, 0, 200, 150, Color.GREEN);
        dc.addShape(rt, 0);

        // test du cercle
        Shape cercle = new Cercle(100, 100, 50, Color.BLUE);
        dc.addShape(cercle, 0);

        // test de la ligne
        Shape ligne = new Line(0, 0, 150, 200, Color.RED);
        dc.addShape(ligne, 0);

        // test du triangle
        Shape tri = new Triangle(10, 10, 20, 20, 10, 20, Color.GREEN);
        dc.addShape(tri, 0);

        // test du polygone
        ArrayList<Integer> listP = new ArrayList<>();
        listP.add(10);
        listP.add(10);
        listP.add(20);
        listP.add(30);
        listP.add(10);
        listP.add(20);
        Shape Poly = new Polygone(listP, Color.RED);
        dc.addShape(Poly, 0);

        // test de la courbe
        Point origin = new Point(100, 100, Color.BLACK);
        Point p1 = new Point(200, 500, Color.BLACK);
        Point p2 = new Point(300, 50, Color.BLACK);
        Point p3 = new Point(400, 300, Color.BLACK);
        Curve curve = new Curve(origin.getX(), origin.getY(), p1, p2, p3, Color.BLACK);
        dc.addShape(curve, 0);


        // possibilité de faire plusieurs calques et d'en rendre invisible ou en supprimer (à décommenter)
        //dc.addNewCalque();
        //dc.setVisibleCalque(0);
        //dc.removeCalque(0);

        // possibilité d'enlever une certaine shape à un certain calque, ou de la rendre visible/invisible (à décommenter)
        //dc.removeShape(0,0);
        //carre.invertVisibilite();

        // afficher les shapes dans la console (à décommenter)
        //System.out.println(dc);

        // aller voir dans la classe PointC pour modifier la taille des points ou pour utiliser des croix plutôt que des carrés

        // initialisation de la librairie graphique
        f.setSize(w, h);
        f.setTitle("Application draw");
        f.add(dc);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}