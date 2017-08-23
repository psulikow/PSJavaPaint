package controller;

import ControllerInterfaces.ICommand;
import viewInterfaces.UIModule;

public class SelectMouseModeCommand__ implements ICommand {
    private final MouseModeSettings__ _MouseModeSettings;
    private final UIModule _uiModule;
    SelectMouseModeCommand__(MouseModeSettings__ mouseModeSettings, UIModule uiModule){
        _MouseModeSettings = mouseModeSettings;
        _uiModule = uiModule;
    }

    @Override
    public void run() {
        MouseMode mouseModeChoice = _uiModule.getDialogResponse(_MouseModeSettings);
        _MouseModeSettings.setCurrentMouseMode(mouseModeChoice);
    }
}
