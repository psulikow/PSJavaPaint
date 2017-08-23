package controller;

import ControllerInterfaces.ICommand;

public class RedoCommand implements ICommand {

    RedoCommand(){
        System.out.println("in redo command");
    }

    @Override
    public void run() {
        CommandHistory.redo();
        System.out.println("in redo run");

    }

}
