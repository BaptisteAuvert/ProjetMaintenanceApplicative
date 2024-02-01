public abstract class Shape{
    protected boolean visibility; 
    public Shape(){
        visibility = true; 
    }

    public void setVisibility(Boolean newVisibility){
        visibility = newVisibility;
    }

    @Override
    public String toString(){
        return "Form (visibility = "+visibility+")"; 
    }
}