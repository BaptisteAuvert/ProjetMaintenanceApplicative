public class Point extends Shape {
    private int Px1;
    private int Py1;


    public Point(int x1,int y1){
        super();
        this.Px1 = x1;
        this.Py1 = y1;
    }

    public int getx(){
        return this.Px1;
    }
    public int gety(){
        return this.Py1;
    }

    @Override
    public String toString(){
        return super.toString() + "Point (x1 = " + this.Px1 + "; x2 = " + this.Py1 +")"; 
    }
}