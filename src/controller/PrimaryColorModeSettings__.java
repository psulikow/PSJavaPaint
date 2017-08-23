package controller;

import viewInterfaces.IDialogChoice;

public class PrimaryColorModeSettings__ implements IDialogChoice {
    private PrimaryColorMode currentPrimaryColorMode;
    public static PrimaryColorMode myPrimaryColor;

    void setCurrentPrimaryColorMode(PrimaryColorMode currentPrimaryColorMode) {
        this.currentPrimaryColorMode = currentPrimaryColorMode;
        myPrimaryColor = this.currentPrimaryColorMode;

    }

    PrimaryColorMode getCurrentPrimaryColorMode() {
        return currentPrimaryColorMode;
    }

    @Override
    public String getDialogTitle() {
        return "Select a  Primary Color Mode";
    }

    @Override
    public String getDialogText() {
        return "Select a Primary Color Mode:";
    }

    @Override
    public Object[] getDialogOptions() {
        return PrimaryColorMode.values();
    }

    @Override
    public Object getDefaultChoice() {
        return getCurrentPrimaryColorMode();
    }

}
