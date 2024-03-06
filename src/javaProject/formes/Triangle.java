package formes;

import java.awt.*;

public class Triangle extends Shape{

    Point p2;
    Point p3;
    public Triangle(int inX1, int inY1, int inX2, int inY2, int inX3, int inY3, Color color){
        super(inX1,inY1,color);
        p2 = new Point(inX2,inY2);
        p3 = new Point(inX3,inY3);
    }
    public void DrawShape (Graphics2D g2d){
        g2d.setColor(color);
        g2d.drawLine(p.x,p.y,p2.x,p2.y);
        g2d.drawLine(p.x,p.y,p3.x,p3.y);
        g2d.drawLine(p2.x,p2.y,p3.x,p3.y);
    }
    public String toString(){
        return super.toString() + "Triangle";
    }
}
