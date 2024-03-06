package formes;

import java.awt.*;
import java.awt.geom.Rectangle2D;
public class Rectangle extends Shape{

    int l;
    int L;
    public Rectangle(int x,int y, int inl, int inL, Color color){
        super(x,y,color);
        l = inl;
        L = inL;
    }
    public void DrawShape (Graphics2D g2d){
        for(int i=0;i<l;i++){
            Point nvp = new Point(p.x,p.y+i);
            Point nvp2 = new Point(p.x+L,p.y+i);

            nvp.DrawPoint(g2d);
            nvp2.DrawPoint(g2d);
        }
        for(int y=0;y<L;y++){
            Point nvp3 = new Point(p.x+y,p.y+l);
            Point nvp4 = new Point(p.x+y,p.y);

            nvp3.DrawPoint(g2d);
            nvp4.DrawPoint(g2d);
        }

    }
    public String toString(){
        return super.toString() + "Rectangle ";
    }
}
