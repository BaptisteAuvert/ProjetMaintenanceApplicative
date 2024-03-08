import formes.Point;
import formes.PointC;
import formes.Shape;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class DrawCanvas extends JComponent {
    private int width;
    private int height;
    private List<Calque> listCalque;
    private Graphics2D g2d;

    public DrawCanvas(int w, int h) {
        width = w;
        height = h;
        listCalque = new ArrayList<>();
        listCalque.add(new Calque());
    }

    /**
     * Dessine les shapes stockées, s'appelle automatiquement
     *
     * @param g nécessaire pour la librairie
     */
    @Override
    protected void paintComponent(Graphics g) {
        g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );
        g2d.setRenderingHints(rh);

        // dessine les points
        for (int i = 0; i < width; i += PointC.taillePoint * 2) {
            for (int y = 0; y < height; y += PointC.taillePoint * 2) {
                Point p = new Point(i, y, Color.gray);
                p.DrawPoint(g2d);
            }
        }

        // appelle la fonction de dessin de toutes les shapes des calques
        for (Calque calque : listCalque) {
            if (calque.getIsVisible()) {
                for (Shape shape : calque.getListShapes()) {
                    if (shape.getVisible()) {
                        shape.DrawShape(g2d);
                    }
                }
            }
        }
    }

    public void addNewCalque() {
        Calque nvCalque = new Calque();
        listCalque.add(nvCalque);
    }

    public void removeCalque(int indice){
        listCalque.remove(indice);
    }

    /**
     * Change la visibilite du calque
     *
     * @param indice: indice du calque à modifier la visibilité
     */
    public void setVisibleCalque(int indice) {
        listCalque.get(indice).setVisible();
    }

    public void addShape(formes.Shape shape, int indice) {
        //System.out.println("Ajout d'une shape au calque " + indice);
        if (indice > listCalque.size())
            indice = listCalque.size() - 1;
        listCalque.get(indice).addShape(shape);
    }

    public void removeShape(int inIndiceShape, int inIndiceCalque) {
        if (inIndiceCalque > listCalque.size())
            inIndiceCalque = listCalque.size();
        Calque calque = listCalque.get(inIndiceCalque);
        if (inIndiceShape > calque.getListShapes().size())
            inIndiceShape = calque.getListShapes().size();
        calque.getListShapes().remove(inIndiceShape);
    }

    public String toString() {
        int numCalque = 0;
        for (Calque calque : listCalque) {
            System.out.println(calque.toString(numCalque));
            numCalque++;
            for (formes.Shape shape :
                    calque.getListShapes()) {
                System.out.println(shape.toString());
            }
            System.out.println("]");
        }
        return "Canvas de taille: [" + this.width + "," + this.height + "]";
    }
}
