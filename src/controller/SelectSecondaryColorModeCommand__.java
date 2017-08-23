package controller;

import ControllerInterfaces.ICommand;
import viewInterfaces.UIModule;

public class SelectSecondaryColorModeCommand__ implements ICommand {

    private final SecondaryColorModeSettings__ _SecondaryColorModeSettings;
    private final UIModule _uiModule;
    SelectSecondaryColorModeCommand__(SecondaryColorModeSettings__ secondaryColorModeSettings, UIModule uiModule){
        _SecondaryColorModeSettings = secondaryColorModeSettings;
        _uiModule = uiModule;
    }

    @Override
    public void run() {
        SecondaryColorMode colorModeChoice = _uiModule.getDialogResponse(_SecondaryColorModeSettings);
        _SecondaryColorModeSettings.setCurrentSecondaryColorMode(colorModeChoice);
    }
}
