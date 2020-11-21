package artyemlavrov.lab3;


public class Main {
    public static void main(String[] args) {
        Scene mainScene = new Scene();
        Action prologue = new Action(Action -> {
            mainScene.carlson.move(mainScene.table);
        });
        Action plot = new Action((Action action) -> {
            action.setHumorLevel(HumorLevel.VERY_FUN);
            mainScene.plate.give(mainScene.carlson, mainScene.sausage);
            System.out.println();
            mainScene.carlson.give(mainScene.birdy, mainScene.sausage);
            System.out.println("Это " + action.getHumorLevelString() + ".");
        });
        prologue.setNext(plot);
        Action epilogue = new Action(Action -> {
            mainScene.boy.say("Эээ...");
        });
        plot.setNext(epilogue);
        Action alternativePlot = new Action((Action action) -> {
            action.setHumorLevel(HumorLevel.VERY_FUN);
            Scene imaginativeScene = new Scene();
            imaginativeScene.plate.give(imaginativeScene.birdy, imaginativeScene.sausage);
            System.out.print(" ");
            imaginativeScene.birdy.fallAsleep();
            System.out.print(" Это тоже " + action.getHumorLevelString());
        });
        plot.setSimilar(alternativePlot);
        prologue.perform();
    }
}
