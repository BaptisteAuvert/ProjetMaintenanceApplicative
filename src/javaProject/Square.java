public class Square extends Shape {
    private Point point;
    private int width;

    public Square(Point point,int width){
        super();
        this.point = point;
        this.width = width;
    }

    @Override
    public String toString(){
        return super.toString() +"Square ("+ this.point + "; width ="+this.width+")"; 
    }
}