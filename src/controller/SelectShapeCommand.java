package controller;

import ControllerInterfaces.ICommand;
import viewInterfaces.UIModule;

public class SelectShapeCommand implements ICommand {
    public static Shape shapeChoice = Shape.ELLIPSE;

    private final ShapeSettings _shapeSettings;
    private final UIModule _uiModule;
    SelectShapeCommand(ShapeSettings shapeSettings, UIModule uiModule){
        _shapeSettings = shapeSettings;
        _uiModule = uiModule;
    }

    @Override
    public void run() {
        shapeChoice = _uiModule.getDialogResponse(_shapeSettings);
        _shapeSettings.setCurrentShape(shapeChoice);

    }

}
