package controller;
import modelInterfaces.IShape;

import java.awt.*;

public class Shapes implements IShape {

    protected int x, y;
    protected int x2, y2;
    protected boolean selected;
    protected boolean copied;
    protected PrimaryColorMode primaryColor;
    protected SecondaryColorMode secondaryColor;
    protected boolean inverted;
    protected ShadingType shadingType;

    ShapeFactory shapeFactory = new ShapeFactory();


    public Shapes(int x, int y, int x2, int y2, boolean inverted) {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
        this.primaryColor = PrimaryColorModeSettings__.myPrimaryColor;
        this.secondaryColor = SecondaryColorModeSettings__.mySecondaryColor;
        this.shadingType = ShadingTypeSettings__.myShadingMode;
        this.inverted = inverted;
        this.selected = false;
        this.copied = false;

    }

    public int getHeight() {
        return Math.max(y, y2)-Math.min(y, y2);
    }

    public int getWidth() {
        return Math.max(x, x2)-Math.min(x, x2);
    }

    public int getX() {
        return Math.min(x, x2);
    }

    public int getY() {
        return Math.min(y, y2);
    }

    public int getX2() {
        return Math.max(x, x2);
    }

    public int getY2() {
        return Math.max(y, y2);
    }


    public int getPX() {
        int px = Math.min(x,x2);
        return px;
    }

    public int getPY() {
        int py = Math.min(y,y2);
        return py;
    }

    public int getPW() {
        int pw = Math.abs(x-x2);
        return pw;
    }

    public int getPH() {
        int ph = Math.abs(y-y2);
        return ph;
    }

    public boolean containsPoint (Point p) {
        if ((p.getX() < getX2() && p.getX() > getX() ) && (p.getY() < getY2() && p.getY() > getY() ))
            return true;
        else
            return false;
    }

    public Color getColor(String c) {
        try
        {
            Color aColor = (Color) Color.class.getField(c).get(null);
            return aColor;
        } catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public void moveBy(int dx, int dy) {
        x = x + dx;
        y = y + dy;
        x2 = x2 + dx;
        y2 = y2 +dy;
    }

    public IShape clone() {
        IShape temp = shapeFactory.getShape(x+50, y+50, x2+50, y2+50, inverted);
        return temp;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public boolean isCopied() {
        return copied;
    }

    public void setIsCopied(boolean copied) {
        this.copied = copied;
    }

    public String getShading() {
        return shadingType.toString();
    }

    public void paint(Graphics2D g2d) {}

    @Override
    public String toString() {
        return "Shapes{" +
                "x=" + x +
                ", y=" + y +
                ", x2=" + x2 +
                ", y2=" + y2 +
                ", selected=" + selected +
                ", primaryColor=" + primaryColor +
                ", secondaryColor=" + secondaryColor +
                ", inverted=" + inverted +
                ", shadingType=" + shadingType +
                '}';
    }
}

