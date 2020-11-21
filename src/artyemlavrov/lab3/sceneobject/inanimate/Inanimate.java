package artyemlavrov.lab3.sceneobject.inanimate;

import artyemlavrov.lab3.givinghandler.GivingHandler;
import artyemlavrov.lab3.givinghandler.inanimate.InanimateGivingHandler;
import artyemlavrov.lab3.sceneobject.SceneObject;

public abstract class Inanimate extends SceneObject {
    public abstract String getInName();

    public abstract String getOutName();

    @Override
    public GivingHandler getGivingHandler() {
        return new InanimateGivingHandler();
    }
}
