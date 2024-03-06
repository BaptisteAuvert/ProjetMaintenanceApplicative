package formes;

import java.awt.*;

import static java.lang.Math.abs;

public class Line extends Shape{
    Point p2;
    public Line(int inX, int inY, int inX2, int inY2,Color color){
        super(inX,inY,color);
        p2 = new Point(inX2, inY2);
    }
    public void DrawShape(Graphics2D g2D) {
        /*float coef = (p2.y-p.y)/(p2.x-p.x);
        System.out.print("Direction: "+coef);

        int AB = (int)Math.round(Math.sqrt(Math.pow(p2.x- p.x,2) + Math.pow(p2.y- p.y,2)));
        System.out.print(",Taille "+AB);
        //Point nvp = new Point(p)
        for(int i=0;i<AB;i++){
            Point nvp = new Point(p.x+Math.round(i*coef),p.y+i);
            nvp.DrawPoint(g2D);
        }*/

        int i, cumul;
        int xinc, yinc;
        int dx = p2.x;
        int dy = p2.y;
        xinc = (dx > 0) ? 1 : -1;
        yinc = (dy > 0) ? 1 : -1;
        dx = abs(dx);
        dy = abs(dy);
        int x = p.x;
        int y = p.y;

        if (dx > dy) {
            cumul = dx / 2;
            for (i = 1; i <= dx; i++) {
                x += xinc;
                cumul += dy;
                if (cumul >= dx) {
                    cumul -= dx;
                    y += yinc;
                }
                Point p = new Point(x, y);
                p.DrawPoint(g2D);
            }
        } else {
            cumul = dy / 2;
            for (i = 1; i <= dy; i++) {
                y += yinc;
                cumul += dx;
                if (cumul >= dy) {
                    cumul -= dy;
                    x += xinc;
                }
                Point p = new Point(x, y);
                p.DrawPoint(g2D);
            }
        }

    }
    public String toString(){
        return super.toString()+"Line";
    }
}
