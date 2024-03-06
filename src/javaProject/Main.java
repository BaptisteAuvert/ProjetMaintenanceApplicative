import formes.*;
import formes.Shape;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int w = 650;
        int h = 400;
        JFrame f = new JFrame();
        DrawCanvas dc = new DrawCanvas(w,h);
        Shape carre = new Carre(10,10,20, Color.gray);
        formes.Shape rt = new formes.Rectangle(0,0,200,150, Color.GREEN);
        Shape ligne = new Line(0,0,150,200, Color.RED);
        //formes.Shape tri = new Triangle(10,10,20,20,10,20, Color.GREEN);
        //formes.Shape rond = new Cercle(50,30,10,Color.BLUE);
        //dc.adShape(carre);
        dc.addNewCalque();
        dc.adShape(rt,0);
        dc.adShape(ligne,1);
        dc.setVisibleCalque(0);
        //dc.adShape(tri);
        //dc.removeShape(1);
        System.out.println(dc);
        f.setSize(w,h);
        f.setTitle("Test Draw");
        f.add(dc);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}