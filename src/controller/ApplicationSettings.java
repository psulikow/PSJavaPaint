package controller;

class ApplicationSettings {
    private ShapeSettings drawShapeSettings = new ShapeSettings();

    ShapeSettings getDrawShapeSettings() {
        return drawShapeSettings;
    }

    //this is new
    private MouseModeSettings__ drawMouseModeSettings = new MouseModeSettings__();

    MouseModeSettings__ getDrawMouseModeSettings() { return drawMouseModeSettings; }

    //this is new
    private ShadingTypeSettings__ drawShadingTypeSettings = new ShadingTypeSettings__();

    ShadingTypeSettings__ getDrawShadingTypeSettings () { return drawShadingTypeSettings; }

    //this is new
    private PrimaryColorModeSettings__ drawPrimaryColorModeSettings = new PrimaryColorModeSettings__();

    PrimaryColorModeSettings__ getDrawPrimaryColorModeSettings() { return drawPrimaryColorModeSettings; }

    //this is new
    private SecondaryColorModeSettings__ drawSecondaryColorModeSettings = new SecondaryColorModeSettings__();

    SecondaryColorModeSettings__ getDrawSecondaryColorModeSettings() { return drawSecondaryColorModeSettings; }

}