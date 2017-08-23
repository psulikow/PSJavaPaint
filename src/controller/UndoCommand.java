package controller;

import ControllerInterfaces.ICommand;

public class UndoCommand implements ICommand {

    UndoCommand(){
        System.out.println("in undo command");
    }

    @Override
    public void run() {
        CommandHistory.undo();
        System.out.println("in undo run");

    }

}
