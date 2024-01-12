package simulation;

import actions.Action;
import entities.*;
import map.Map;
import renderer.Renderer;

import java.util.ArrayList;
import java.util.List;

public class Simulation {
    private boolean isRunning;
    private int movementCount;
    private Map map;
    private Renderer renderer;
    private List<Action> initActions;
    private List<Action> turnActions;

    /*public Simulation(Renderer renderer, List<Action> initActions, List<Action> turnActions) {
        this.renderer = renderer;
        this.initActions = initActions;
        this.turnActions = turnActions;
    }*/

    public void startSimulation() {
        List<Entity> entityList = new ArrayList<>();
        entityList.add(new Grass('#', "Grass1"));
        entityList.add(new Grass('#', "Grass2"));
        entityList.add(new Grass('#', "Grass3"));
        entityList.add(new Tree('!', "Tree1"));
        entityList.add(new Tree('!', "Tree2"));
        entityList.add(new Tree('!', "Tree3"));
        entityList.add(new Rock('*', "Rock1"));
        entityList.add(new Rock('*', "Rock2"));

        entityList.add(new Herbivore('&', "Herbivore1", 34, 100));
        entityList.add(new Predator('@', "Predator1", 54, 100));

        map = new Map(entityList, 10, 10);
        isRunning = true;
    }

    public void nextTurn() {
        renderer = new Renderer(map);

        renderer.render(isRunning);
    }

    public void pauseSimulation() {
    }
}
