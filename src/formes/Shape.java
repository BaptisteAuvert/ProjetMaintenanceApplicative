package formes;

import java.awt.*;

public abstract class Shape {
    protected Point p;
    protected Boolean isVisible;

    /**
     * @param inX Coordonnée X du point
     * @param inY Coordonnée Y du point
     * @param col Color de la shape
     */
    public Shape(int inX, int inY, Color col) {
        this.p = new Point(inX, inY, col);
        isVisible = true;
    }

    public void invertVisibilite() {
        isVisible = !isVisible;
    }

    /**
     * Methode propre à chaque shape, permet de dessiner sur le Graphique
     *
     * @param g2d Graphique sur lequel sera dessinée la forme
     */
    public void DrawShape(Graphics2D g2d) {
    }

    public Boolean getVisible() {
        return isVisible;
    }

    public String toString() {
        return "Shape de couleur " + p.getColor() + ": de type: ";
    }

}
