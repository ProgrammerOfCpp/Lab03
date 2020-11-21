package artyemlavrov.lab3.sceneobject.animate;

import artyemlavrov.lab3.givinghandler.GivingHandler;
import artyemlavrov.lab3.givinghandler.animate.AnimateGivingHandler;
import artyemlavrov.lab3.sceneobject.SceneObject;

import java.util.Objects;

public abstract class Animate extends SceneObject {
    private boolean isSleeping = false;

    public void fallAsleep() {
        if (!isSleeping()) {
            System.out.printf("%s засыпает.", this.getName());
            isSleeping = true;
        }
    }

    public boolean isSleeping() {
        return isSleeping;
    }

    @Override
    public GivingHandler getGivingHandler() {
        return new AnimateGivingHandler();
    }

    @Override
    public String toString() {
        return "Animate{" +
                "isSleeping=" + isSleeping +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animate)) return false;
        if (!super.equals(o)) return false;
        Animate animate = (Animate) o;
        return isSleeping == animate.isSleeping;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isSleeping);
    }
}
