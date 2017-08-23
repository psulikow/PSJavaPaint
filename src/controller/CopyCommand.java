package controller;

import ControllerInterfaces.ICommand;
import ControllerInterfaces.IUndoable;
import viewInterfaces.UIModule;

import java.util.Stack;

public class CopyCommand implements ICommand, IUndoable {

    private final UIModule _uiModule;
    private ShapeList myList;
    private Stack<IUndoable> undoStack;
    private Stack<IUndoable> redoStack;


    CopyCommand(ShapeList myList, UIModule _uiModule) {
        System.out.println("in copy command");
        this._uiModule = _uiModule;
        this.myList = myList;
    }

    @Override
    public void run() {
        for (int i = myList.size() - 1; i >= 0 ; i-- ) {
            if (myList.get(i).isSelected()) {
                myList.get(i).setIsCopied(true);
                System.out.println("is this shape copied " + myList.get(i).isCopied());
            }
        }
        System.out.println("in delete run");
        CommandHistory.add(this);
    }


    @Override
    public void undo() {

    }


    @Override
    public void redo() {
        run();
    }

}
