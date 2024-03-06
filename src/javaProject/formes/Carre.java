package formes;
import java.awt.geom.Rectangle2D;

import java.awt.*;

public class Carre extends Shape{
    int l;
    public Carre(int inX, int inY, int inL, Color color){
        super(inX,inY,color);
        l = inL;
    }
    public void DrawShape(Graphics2D g2d){
        for(int i=0;i<l;i++){
            Point nvp = new Point(p.x,p.y+i);
            Point nvp2 = new Point(p.x+i,p.y);
            Point nvp3 = new Point(p.x+l,p.y+i);
            Point nvp4 = new Point(p.x+i,p.y+l);

            nvp.DrawPoint(g2d);
            nvp2.DrawPoint(g2d);
            nvp3.DrawPoint(g2d);
            nvp4.DrawPoint(g2d);
        }
    }
    public String toString(){
        return super.toString() + "Carré";
    }
}
