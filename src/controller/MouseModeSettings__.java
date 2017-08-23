package controller;

import viewInterfaces.IDialogChoice;

public class MouseModeSettings__ implements IDialogChoice {
    private MouseMode currentMouseMode;
    public static MouseMode myMouseMode;
    void setCurrentMouseMode(MouseMode currentMouseMode) {
        this.currentMouseMode = currentMouseMode;
        myMouseMode = this.currentMouseMode;
    }

    MouseMode getCurrentMouseMode() {
        return currentMouseMode;
    }

    @Override
    public String getDialogTitle() {
        return "Select a Mouse Mode";
    }

    @Override
    public String getDialogText() {
        return "Select a Mouse Mode:";
    }

    @Override
    public Object[] getDialogOptions() {
        return MouseMode.values();
    }

    @Override
    public Object getDefaultChoice() {
        return getCurrentMouseMode();
    }

}
