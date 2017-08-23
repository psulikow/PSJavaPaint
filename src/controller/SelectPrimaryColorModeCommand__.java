package controller;

import ControllerInterfaces.ICommand;
import viewInterfaces.UIModule;

public class SelectPrimaryColorModeCommand__ implements ICommand {

    private final PrimaryColorModeSettings__ _PrimaryColorModeSettings;
    private final UIModule _uiModule;
    SelectPrimaryColorModeCommand__(PrimaryColorModeSettings__ primaryColorModeSettings, UIModule uiModule){
        _PrimaryColorModeSettings = primaryColorModeSettings;
        _uiModule = uiModule;
    }

    @Override
    public void run() {
        PrimaryColorMode colorModeChoice = _uiModule.getDialogResponse(_PrimaryColorModeSettings);
        _PrimaryColorModeSettings.setCurrentPrimaryColorMode(colorModeChoice);
    }
}
