package controller;

import viewInterfaces.EventName;
import viewInterfaces.UIModule;

public class JPaintController implements IPaintController {
    private final UIModule _uiModule;
    private final ApplicationSettings _settings = new ApplicationSettings();
    private ShapeList myList;




    public JPaintController(UIModule uiModule, ShapeList myList){
        _uiModule = uiModule;
        _settings.getDrawShapeSettings().setCurrentShape(Shape.ELLIPSE);

        //new
        _settings.getDrawMouseModeSettings().setCurrentMouseMode(MouseMode.DRAW);

        //new
        _settings.getDrawShadingTypeSettings().setCurrentShadingType(ShadingType.OUTLINE);

        //new
        _settings.getDrawPrimaryColorModeSettings().setCurrentPrimaryColorMode(PrimaryColorMode.BLUE);

        //new
        _settings.getDrawSecondaryColorModeSettings().setCurrentSecondaryColorMode(SecondaryColorMode.GREEN);

        this.myList = myList;


    }

    @Override
    public void run() {
        _uiModule.addEvent(EventName.CHOOSE_SHAPE, new SelectShapeCommand(_settings.getDrawShapeSettings(), _uiModule));

        //this is new
        _uiModule.addEvent(EventName.CHOOSE_MOUSE_MODE, new SelectMouseModeCommand__(_settings.getDrawMouseModeSettings(), _uiModule));

        //this is new
        _uiModule.addEvent(EventName.CHOOSE_SHADING_TYPE, new SelectShadingTypeCommand__(_settings.getDrawShadingTypeSettings(), _uiModule));

        //this is new
        _uiModule.addEvent(EventName.CHOOSE_PRIMARY_COLOR, new SelectPrimaryColorModeCommand__(_settings.getDrawPrimaryColorModeSettings(), _uiModule));

        //this is new
        _uiModule.addEvent(EventName.CHOOSE_SECONDARY_COLOR, new SelectSecondaryColorModeCommand__(_settings.getDrawSecondaryColorModeSettings(), _uiModule));

        //this is new
        _uiModule.addEvent(EventName.DELETE, new DeleteCommand(myList, _uiModule));

        //this is new
        _uiModule.addEvent(EventName.COPY, new CopyCommand(myList, _uiModule));

        //this is new
        _uiModule.addEvent(EventName.PASTE, new PasteCommand(myList, _uiModule));

        //this is new
        _uiModule.addEvent(EventName.UNDO, new UndoCommand());

        //this is new
        _uiModule.addEvent(EventName.REDO, new RedoCommand());

    }




}
