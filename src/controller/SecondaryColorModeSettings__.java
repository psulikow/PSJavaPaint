package controller;

import viewInterfaces.IDialogChoice;

public class SecondaryColorModeSettings__ implements IDialogChoice {
    private SecondaryColorMode currentSecondaryColorMode;
    public static SecondaryColorMode mySecondaryColor;

    void setCurrentSecondaryColorMode(SecondaryColorMode currentSecondaryColorMode) {
        this.currentSecondaryColorMode = currentSecondaryColorMode;
        mySecondaryColor = this.currentSecondaryColorMode;

    }

    SecondaryColorMode getCurrentSecondaryColorMode() {
        return currentSecondaryColorMode;
    }

    @Override
    public String getDialogTitle() {
        return "Select a  Secondary Color Mode";
    }

    @Override
    public String getDialogText() {
        return "Select a Secondary Color Mode:";
    }

    @Override
    public Object[] getDialogOptions() {
        return SecondaryColorMode.values();
    }

    @Override
    public Object getDefaultChoice() {return getCurrentSecondaryColorMode(); }

}
