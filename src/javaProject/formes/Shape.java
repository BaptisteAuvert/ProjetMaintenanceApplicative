package formes;

import java.awt.*;

public abstract class Shape {
    protected Point p;
    protected Color color;
    protected Boolean isVisible;

    /**
     *
     * @param inX Coordonné X du point
     * @param inY Coordonné Y du point
     * @param col Color de la shape
     */
    public Shape(int inX, int inY, Color col){
        this.p = new Point(inX,inY);
        color = col;
        isVisible = true;
    }
    public void setVisibilite(){
        isVisible = !isVisible;
    }

    /**
     * Methode propre à chaque shape, permet de dessiner sur le Graphique
     * @param g2D Graphique sur lequel sera dessiner la forme
     */
    public void DrawShape(Graphics2D g2D){
    }
    public String toString(){
        return "Shape de couleur "+color+ ": de type: ";
    }

}
