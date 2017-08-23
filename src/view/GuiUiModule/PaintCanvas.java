package view.GuiUiModule;

import controller.MouseMode;
import controller.MouseModeSettings__;
import controller.ShapeFactory;
import controller.ShapeList;
import modelInterfaces.IShape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PaintCanvas extends JComponent {

    ShapeFactory shapeFactory = new ShapeFactory();

    ShapeList myList = new ShapeList();

    int x, y, x2, y2;

    protected boolean inverted;

    public PaintCanvas(ShapeList myList) {
        this.myList = myList;
        x = y = x2 = y2 = 0; //
        MyMouseListener listener = new MyMouseListener();
        addMouseListener(listener);
        addMouseMotionListener(listener);
    }

    public Point setStartPoint(int x, int y) {
        this.x = x;
        this.y = y;
        return new Point(x,y);
    }

    public Point setEndPoint(int x, int y) {
        x2 = (x);
        y2 = (y);
        return new Point(x,y);
    }

    class MyMouseListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            setStartPoint(e.getX(), e.getY());
        }

        public void mouseDragged(MouseEvent e) {
            System.out.println("dragging");
            setEndPoint(e.getX(), e.getY());
        }

        public void mouseReleased(MouseEvent e) {
            setEndPoint(e.getX(), e.getY());
            inverted = e.getButton() == 3;
            if (MouseModeSettings__.myMouseMode == MouseMode.SELECT) {
                selectedShape();
            }
            if (MouseModeSettings__.myMouseMode == MouseMode.DRAW) {
                addShape();
            }
            if (MouseModeSettings__.myMouseMode == MouseMode.MOVE) {
                moveShape();
            }
            repaint();
        }
    }

    public void addShape () {
        IShape shape2 = shapeFactory.getShape(x, y, x2, y2, inverted);
        myList.add(shape2);
    }

    public void selectedShape () {
        System.out.println("searching shapes");
        for (int i = myList.size() - 1; i >= 0 ; i-- ) {
            System.out.println(setStartPoint(x,y));
            System.out.println(myList.get(i));
            if ( myList.get(i).containsPoint(setStartPoint(x, y))) {
                if (myList.get(i).isSelected()) {
                    myList.get(i).setSelected(false);
                }
                else {
                    myList.get(i).setSelected(true);
                }
                System.out.println("point was in shape");
            }
        }
    }

    public void moveShape () {
        System.out.println("searching shapes");
        for (int i = myList.size() - 1; i >= 0 ; i-- ) {
            System.out.println(setStartPoint(x,y));
            System.out.println(myList.get(i));
            if ( myList.get(i).containsPoint(setStartPoint(x, y))) {
                System.out.println(myList.get(i));
                myList.get(i).moveBy((x2-x), (y2-y));
                System.out.println("point was in shape");
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        for(int i = 0 ; i < myList.size() ; i++) {
            myList.get(i).paint(g2d);
        }
        g2d.dispose();
    }
}