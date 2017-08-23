package controller;

import ControllerInterfaces.ICommand;
import ControllerInterfaces.IUndoable;
import viewInterfaces.UIModule;

import java.util.Stack;

public class DeleteCommand implements ICommand, IUndoable {

    private final UIModule _uiModule;
    private ShapeList myList;
    private ShapeList deletedList = new ShapeList();
    private Stack<IUndoable> undoStack;
    private Stack<IUndoable> redoStack;

    DeleteCommand(ShapeList myList, UIModule _uiModule){
        this._uiModule = _uiModule;
        this.myList = myList;

        System.out.println("in delete command");
    }

    @Override
    public void run() {
        for (int i = myList.size() - 1; i >= 0 ; i-- ) {
            if (myList.get(i).isSelected()) {
                deletedList.add(myList.remove(i));

                System.out.println("removing shape");
            }
        }
        System.out.println("in delete run");
        CommandHistory.add(this);
    }


    @Override
    public void undo() {
        for (int i = deletedList.size() - 1; i >= 0; i--) {
                myList.add(deletedList.remove(i));
                System.out.println("removing shape");
        }
    }


    @Override
    public void redo() {
        run();
    }

}


