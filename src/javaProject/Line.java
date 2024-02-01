public class Line extends Shape {
    private Point point1;
    private Point point2;

    public Line(Point point1,Point point2){
        super();
        this.point2 = point2;
        this.point1 = point1;
    }

    @Override
    public String toString(){
        return super.toString() +"Line (point1 ="+ this.point1 + "; point2 ="+this.point2+")"; 
    }
}