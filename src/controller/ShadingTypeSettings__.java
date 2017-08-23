package controller;

import viewInterfaces.IDialogChoice;

public class ShadingTypeSettings__ implements IDialogChoice {
    private ShadingType currentShadingType;
    public static ShadingType myShadingMode;


    void setCurrentShadingType(ShadingType currentShadingType) {
        this.currentShadingType = currentShadingType;
        myShadingMode = this.currentShadingType;

    }

    ShadingType getCurrentShadingType() {
        return currentShadingType;
    }

    @Override
    public String getDialogTitle() {
        return "Select a Shading Mode";
    }

    @Override
    public String getDialogText() {
        return "Select a Shading Mode:";
    }

    @Override
    public Object[] getDialogOptions() {
        return ShadingType.values();
    }

    @Override
    public Object getDefaultChoice() {
        return getCurrentShadingType();
    }

}
