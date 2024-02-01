import java.util.*;
import java.util.ArrayList;

public class Layer {
    private ArrayList<Shape> listShape ;
    private Boolean visibility;

    public Layer(){
        listShape = new ArrayList<Shape>();
        visibility = true;
    }

    public void addShape(Shape newShape){
        listShape.add(newShape);
    }

    public void removeShape(int id){
        listShape.remove(id);
    }

    public void setVisibility(int id, Boolean visibility){
        listShape.get(id).setVisibility(visibility);
    }

    public String getList(){
        Iterator<Shape> iter = listShape.iterator();
        String returnString ="Le layer est composé de : \n";
        int i = 0;
        while (iter.hasNext()){
            returnString += i++ +" -> " + iter.next() + "\n";
        }
        return returnString;
    }


    @Override
    public String toString (){
        Iterator<Shape> iter = listShape.iterator();
        String returnString ="Le layer est composé de : \n";
        while (iter.hasNext()){
            returnString += "-" + iter.next() + "\n";
        }
        return returnString;
    }

}