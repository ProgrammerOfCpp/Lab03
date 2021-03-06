package artyemlavrov.lab3.givinghandler.animate;

import artyemlavrov.lab3.givinghandler.GivingHandler;
import artyemlavrov.lab3.sceneobject.SceneObject;
import artyemlavrov.lab3.sceneobject.inanimate.Inanimate;
import artyemlavrov.lab3.sceneobject.animate.Animate;

public class AnimateGivingHandler implements GivingHandler {
    public boolean handle(SceneObject from, SceneObject to, SceneObject item) {
        if (to instanceof Animate) {
            System.out.printf("%s даёт %s %s.", from.getName(), item.getAccusativeName(), to.getDativeName());
        }
        if (to instanceof Inanimate){
            System.out.printf("%s кладёт %s %s.", from.getName(), item.getAccusativeName(), ((Inanimate)to).getInName());
        }
        return true;
    }
}
