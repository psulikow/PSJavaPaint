package controller;
import java.awt.*;

/**
 * Created by paulsulikowski on 7/17/17.
 */

public class Triangle extends Shapes {

    public Triangle(int x, int y, int x2, int y2, boolean inverted) {super(x, y, x2, y2, inverted);

    }

    public int[] getXS() {
        int[] xs = { getX(), getX() + (getX2()-getX()), getX2() };
        return xs;
    }

    public int[] getYS() {
        int[] ys = { getY2(), getY() , getY2() };
        return ys;
    }
    @Override
    public void paint(Graphics2D g2d) {
        g2d.setStroke(new BasicStroke(5));
        System.out.println("in the triangle class ");
        g2d.setColor(getColor(primaryColor.toString()));
        if (inverted) {
            g2d.setColor(getColor(secondaryColor.toString()));
        }
        if (isSelected()) {
            System.out.println("in isSelected");
            g2d.setColor(Color.GRAY);
        }
        if (getShading() == "OUTLINE")
            g2d.drawPolygon(getXS(), getYS(), 3);
        else if (getShading() == "FILLED IN")
            g2d.fillPolygon(getXS(), getYS(), 3);
        else if (getShading() == "OUTLINE AND FILLED IN") {
            g2d.fillPolygon(getXS(), getYS(), 3);
            if (inverted) {
                g2d.setColor(getColor(primaryColor.toString()));
            }
            else {
                g2d.setColor(getColor(secondaryColor.toString()));
            }
            g2d.drawPolygon(getXS(), getYS(), 3);
        }
    }
}