public class Rectangle extends Shape {
    private Point point;
    private int width;
    private int height;

    public Rectangle(Point point,int width,int height){
        super();
        this.point = point;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString(){
        return super.toString() +"Rectangle ("+ this.point + "; width ="+this.width+"; height ="+this.height+")"; 
    }
}