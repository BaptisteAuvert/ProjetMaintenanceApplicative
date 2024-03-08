import formes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Calque {
    private List<Shape> listShapes;
    private Boolean isVisible;

    public Calque() {
        isVisible = true;
        listShapes = new ArrayList<>();
    }

    public void setVisible() {
        isVisible = !isVisible;
    }

    public void addShape(Shape shape) {
        listShapes.add(shape);
    }

    public List<Shape> getListShapes() {
        return listShapes;
    }

    public Boolean getIsVisible(){
        return isVisible;
    }

    public String toString(int indice) {
        return "Calque num " + indice + ", List shape: [";
    }
}
