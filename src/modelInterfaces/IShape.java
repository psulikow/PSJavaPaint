package modelInterfaces;

import java.awt.*;

public interface IShape {
    void paint(Graphics2D g2d);
    boolean containsPoint (Point p);
    void setSelected(boolean selected);
    boolean isSelected();
    void setIsCopied(boolean copied);
    boolean isCopied();
    void moveBy(int dx, int dy);
    IShape clone();
}
