package controller;
/**
 * Created by paulsulikowski on 7/17/17.
 */
public class ShapeFactory {

    //use getShape method to get object of type shape
    public Shapes getShape(int x, int y, int x2, int y2, boolean inverted){

        if(ShapeSettings.myShapeMode == null){
            return null;
        }
        if(ShapeSettings.myShapeMode == Shape.ELLIPSE){
            System.out.println("in the factory ellipse");
            return new Ellipse(x, y, x2, y2, inverted);

        } else if(ShapeSettings.myShapeMode == Shape.RECTANGLE){
            System.out.println("in the factory rect");
            return new Rectangle(x, y, x2, y2, inverted);

        } else if(ShapeSettings.myShapeMode == Shape.TRIANGLE){
            System.out.println("in the factory tri");
            return new Triangle(x, y, x2, y2, inverted);
        }

        return null;
    }

}
