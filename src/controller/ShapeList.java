package controller;

import modelInterfaces.IShape;

import java.util.ArrayList;

/**
 * Created by paulsulikowski on 8/8/17.
 */
public class ShapeList {

    private ArrayList<IShape> myList;

    public ShapeList () {
        myList = new ArrayList<>();
    }

    public void add(IShape shape) {
        myList.add(shape);
    }

    public IShape remove(int i) {
        return myList.remove(i);

    }

    public IShape get(int i) {
        return myList.get(i);
    }

    public int size() {
        return myList.size();
    }
}
