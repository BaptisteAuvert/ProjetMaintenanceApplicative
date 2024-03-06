package formes;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Point {
    int x;
    int y;
    public Point(int inX, int inY){
        x=inX;
        y=inY;
    }
    public void DrawPoint(Graphics2D g2d){
        Rectangle2D.Double r = new Rectangle2D.Double(x,y,1,1);
        //g2d.setColor(color);
        g2d.fill(r);
    }
    public String toString(){
        return "\n Point: x: "+x+", y: "+y;
    }
}
