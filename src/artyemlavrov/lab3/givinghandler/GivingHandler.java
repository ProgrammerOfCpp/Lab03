package artyemlavrov.lab3.givinghandler;

import artyemlavrov.lab3.sceneobject.SceneObject;

public interface GivingHandler {
    boolean handle(SceneObject from, SceneObject to, SceneObject item);
}
