package controller;

import ControllerInterfaces.ICommand;
import viewInterfaces.UIModule;

public class SelectShadingTypeCommand__ implements ICommand {
    private final ShadingTypeSettings__ _ShadingTypeSettings;
    private final UIModule _uiModule;
    SelectShadingTypeCommand__(ShadingTypeSettings__ ShadingTypeSettings, UIModule uiModule){
        _ShadingTypeSettings = ShadingTypeSettings;
        _uiModule = uiModule;
    }

    @Override
    public void run() {
        ShadingType ShadingTypeChoice = _uiModule.getDialogResponse(_ShadingTypeSettings);
        _ShadingTypeSettings.setCurrentShadingType(ShadingTypeChoice);
    }
}
