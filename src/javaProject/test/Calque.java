package test;

import formes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Calque {
    List<Shape> listShapes;
    Boolean isVisible;
    public Calque() {
        isVisible = true;
        listShapes = new ArrayList<>();
    }
    public void setVisible(){
        isVisible = !isVisible;
    }
    public void addShape(Shape shape){
        listShapes.add(shape);
    }
    public void delelteShape(Shape shape){
        listShapes.remove(shape);
    }
    public List<Shape> getListShapes(){
        return listShapes;
    }
    public String toString(int indice){
        return "Calque num "+indice+", List shape: [";
    }
}
