package test;

import formes.Point;
import formes.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DrawCanvas extends JComponent{
    private int width;
    private int height;
    private List<Calque> listCalque;
    private Graphics2D g2d;
    public DrawCanvas(int w, int h){
        width = w;
        height = h;
        listCalque = new ArrayList<>();
        listCalque.add(new Calque());
    }

    /**
     * Dessine les shapes stocké, s'appel automatiquementt
     * @param g
     */
    @Override
    protected void paintComponent(Graphics g){
        g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );
        g2d.setRenderingHints(rh);

        //Appel la fonction de dessin de toute les shapes des calques
        for (Calque calque : listCalque){
            if (calque.isVisible) {
                for (Shape shape : calque.getListShapes()) {
                    shape.DrawShape(g2d);
                }
            }
        }

        //Dessine les points
        for(int i=10;i<width;i+=10){
            for(int y=10;y<height;y+=10){
                Point p = new Point(i,y);
                p.DrawPoint(g2d);
            }
        }
    }

    /**
     * Ajout d'un nouveau calque
     */
    public void addNewCalque(){
        Calque nvCalque = new Calque();
        listCalque.add(nvCalque);
    }

    /**
     * Change la visibilite du calque
     * @param indice: indice du calque à modifier la visibilité
     */
    public void setVisibleCalque(int indice){
        listCalque.get(indice).setVisible();
    }
    public void adShape(Shape shape, int indice){
        System.out.println("Ajout d'une shape au calque "+indice);
        if (indice>listCalque.size())
            indice=listCalque.size();
        listCalque.get(indice).addShape(shape);
    }
    public void removeShape(int inIndiceShape, int inIndiceCalque){
        if (inIndiceCalque>listCalque.size())
            inIndiceCalque = listCalque.size();
        Calque calque = listCalque.get(inIndiceCalque);
        if(inIndiceShape>calque.getListShapes().size())
            inIndiceShape = calque.listShapes.size();
        calque.listShapes.remove(inIndiceShape);
    }
    public String toString(){
        int numCalque = 0;
        for (Calque calque: listCalque) {
            System.out.println(calque.toString(numCalque));
            numCalque++;
            for (Shape shape:
                    calque.getListShapes()) {
                System.out.println(shape.toString());
            }
            System.out.println("]");
        }
        return "Canvas de taille: ["+this.width+","+this.height+"]";
    }
}
