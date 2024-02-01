public class Circle extends Shape {
    private Point point;
    private int rayon;

    public Circle(Point point,int rayon){
        super();
        this.point = point;
        this.rayon = rayon;
    }

    @Override
    public String toString(){
        return super.toString() +"Circle ("+ this.point + "; rayon ="+this.rayon+")"; 
    }
}