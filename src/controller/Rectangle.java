package controller;

import java.awt.*;

/**
 * Created by paulsulikowski on 7/17/17.
 */

public class Rectangle extends Shapes {

    public Rectangle(int x, int y, int x2, int y2, boolean inverted) {super(x, y, x2, y2, inverted);}



    @Override
    public void paint(Graphics2D g2d) {
        g2d.setStroke(new BasicStroke(5));
        System.out.println("in the rect class ");
        g2d.setColor(getColor(primaryColor.toString()));
        if (inverted) {
            g2d.setColor(getColor(secondaryColor.toString()));
        }
        if (isSelected()) {
            System.out.println("in isSelected");
            g2d.setColor(Color.GRAY);
        }
        if (getShading() == "OUTLINE")
            g2d.drawRect(getX(), getY(), getWidth(), getHeight());
        else if (getShading() == "FILLED IN")
            g2d.fillRect(getX(), getY(), getWidth(), getHeight());
        else if (getShading() == "OUTLINE AND FILLED IN") {
            g2d.fillRect(getX(), getY(), getWidth(), getHeight());
            if (inverted) {
                g2d.setColor(getColor(primaryColor.toString()));
            }
            else {
                g2d.setColor(getColor(secondaryColor.toString()));
            }
            g2d.drawRect(getX(), getY(), getWidth(), getHeight());
        }
    }


}
