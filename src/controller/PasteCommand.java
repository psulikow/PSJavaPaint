package controller;

import ControllerInterfaces.ICommand;
import ControllerInterfaces.IUndoable;
import viewInterfaces.UIModule;

import java.util.Stack;

public class PasteCommand implements ICommand {
    private final UIModule _uiModule;
    private ShapeList myList;
    private Stack<IUndoable> undoStack;
    private Stack<IUndoable> redoStack;

    PasteCommand(ShapeList myList, UIModule _uiModule) {
        System.out.println("in paste command");
        this._uiModule = _uiModule;
        this.myList = myList;
    }

    @Override
    public void run() {
        System.out.println("in paste run");
        for (int i = myList.size() - 1; i >= 0 ; i-- ) {
            if (myList.get(i).isCopied()) {
                System.out.println("in the loop for is copied");
                myList.add(myList.get(i).clone());
            }
        }
    }
}



