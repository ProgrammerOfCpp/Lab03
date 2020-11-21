package artyemlavrov.lab3.sceneobject.animate.person;

public class Boy extends Person {
    @Override
    public String getName() {
        return "Малыш";
    }

    @Override
    public String getAccusativeName() {
        return "Малыша";
    }

    @Override
    public String getDativeName() {
        return "Малышу";
    }
}
