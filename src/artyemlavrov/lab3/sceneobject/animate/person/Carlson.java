package artyemlavrov.lab3.sceneobject.animate.person;

import artyemlavrov.lab3.givinghandler.GivingHandler;
import artyemlavrov.lab3.givinghandler.animate.CarlsonGivingHandler;

public class Carlson extends Person {
    @Override
    public String getName() {
        return "Карлсон";
    }

    @Override
    public String getAccusativeName() {
        return "Карлсона";
    }

    @Override
    public String getDativeName() {
        return "Карлсону";
    }

    @Override
    public GivingHandler getGivingHandler() {
        return new CarlsonGivingHandler();
    }
}
