package artyemlavrov.lab3;

import artyemlavrov.lab3.sceneobject.animate.Birdy;
import artyemlavrov.lab3.sceneobject.animate.person.Boy;
import artyemlavrov.lab3.sceneobject.animate.person.Carlson;
import artyemlavrov.lab3.sceneobject.inanimate.Cupboard;
import artyemlavrov.lab3.sceneobject.inanimate.Plate;
import artyemlavrov.lab3.sceneobject.inanimate.Sausage;
import artyemlavrov.lab3.sceneobject.inanimate.Table;

import java.util.Objects;

public class Scene {
    Carlson carlson;
    Boy boy;
    Birdy birdy;
    Sausage sausage;
    Plate plate;
    Table table;
    Cupboard cupboard;

    public Scene() {
        carlson = new Carlson();
        boy = new Boy();
        birdy = new Birdy();

        sausage = new Sausage();

        plate = new Plate();
        plate.put(sausage);

        table = new Table();
        table.put(plate);

        cupboard = new Cupboard();
        cupboard.put(birdy);
    }

    @Override
    public String toString() {
        return "Scene{" +
                "carlson=" + carlson +
                ", boy=" + boy +
                ", birdy=" + birdy +
                ", sausage=" + sausage +
                ", plate=" + plate +
                ", table=" + table +
                ", cupboard=" + cupboard +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Scene)) return false;
        Scene scene = (Scene) o;
        return Objects.equals(carlson, scene.carlson) &&
                Objects.equals(boy, scene.boy) &&
                Objects.equals(birdy, scene.birdy) &&
                Objects.equals(sausage, scene.sausage) &&
                Objects.equals(plate, scene.plate) &&
                Objects.equals(table, scene.table) &&
                Objects.equals(cupboard, scene.cupboard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carlson, boy, birdy, sausage, plate, table, cupboard);
    }
}
