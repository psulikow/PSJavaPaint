package controller;
import java.awt.*;

/**
 * Created by paulsulikowski on 7/17/17.
 */

public class Ellipse extends Shapes {

    public Ellipse(int x, int y, int x2, int y2, boolean inverted) {
        super(x, y, x2, y2, inverted);
    }

    @Override
    public void paint(Graphics2D g2d) {
        g2d.setStroke(new BasicStroke(5));
        System.out.println("in the ellipse class ");
        g2d.setColor(getColor(primaryColor.toString()));
        if (inverted) {
            g2d.setColor(getColor(secondaryColor.toString()));
        }
        if (isSelected()) {
            System.out.println("in isSelected");
            g2d.setColor(Color.GRAY);
        }
        if (getShading() == "OUTLINE")
            g2d.drawOval(getPX(), getPY(), getPW(), getPH());
        else if (getShading() == "FILLED IN")
            g2d.fillOval(getPX(), getPY(), getPW(), getPH());
        else if (getShading() == "OUTLINE AND FILLED IN") {
            g2d.fillOval(getPX(), getPY(), getPW(), getPH());
            if (inverted) {
                g2d.setColor(getColor(primaryColor.toString()));
            }
            else {
                g2d.setColor(getColor(secondaryColor.toString()));
            }
            g2d.drawOval(getPX(), getPY(), getPW(), getPH());
        }

    }
}
