package artyemlavrov.lab3.givinghandler.animate;

import artyemlavrov.lab3.sceneobject.SceneObject;
import artyemlavrov.lab3.sceneobject.animate.Birdy;
import artyemlavrov.lab3.sceneobject.inanimate.Sausage;

public class CarlsonGivingHandler extends AnimateGivingHandler {
    @Override
    public boolean handle(SceneObject from, SceneObject to, SceneObject item) {
        if (to instanceof Birdy && item instanceof Sausage) {
            System.out.println("Как сказано в книге, \"он схватил с тарелки последний кусок колбасы и сунул его в ручку спящей Гюль-фии\".");
            return true;
        }
        return super.handle(from, to, item);
    }
}
