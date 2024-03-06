package formes;

import java.awt.*;
public class Cercle extends Shape{
    int rayon;

    public Cercle(int inX, int inY, int r, Color color){
        super(inX,inY,color);
        rayon = r;
    }

    public void DrawShape(Graphics2D g2d){
        g2d.setColor(color);
        g2d.drawOval(p.x, p.y, rayon,rayon);
    }
    public String toString(){
        return super.toString() + "Cercle";
    }
}
