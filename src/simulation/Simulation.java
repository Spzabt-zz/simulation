package simulation;

import actions.Action;
import entities.*;
import map.Map;
import map.Position;
import renderer.Renderer;
import renderer.RendererImpl;

import java.util.ArrayList;
import java.util.List;

public class Simulation {
    private boolean isRunning;
    private int movementCount;
    private Map map;
    private Renderer renderer;
    private final List<Action> initActions;
    private final List<Action> turnActions;

    public Simulation() {
        this.initActions = new ArrayList<>();
        this.turnActions = new ArrayList<>();
        isRunning = true;
    }

    public void addInitAction(Action action) {
        initActions.add(action);
    }

    public void addTurnAction(Action action) {
        turnActions.add(action);
    }

    public void startSimulation() {
        List<Entity> entityList = new ArrayList<>();

        entityList.add(new Grass("~", "Grass1", new Position(3, 5)));
        entityList.add(new Grass("~", "Grass2", new Position(1, 2)));
        entityList.add(new Grass("~", "Grass3", new Position(3, 4)));

        entityList.add(new Tree("!!", "Tree1", new Position(2, 8)));
        entityList.add(new Tree("!!", "Tree2", new Position(7, 2)));
        entityList.add(new Tree("!!", "Tree3", new Position(6, 1)));

        entityList.add(new Rock("0", "Rock1", new Position(4, 4)));
        entityList.add(new Rock("0", "Rock2", new Position(4, 8)));

        entityList.add(new Herbivore("&", "Herbivore1", 34, 100, new Position(5, 5)));
        entityList.add(new Predator("$", "Predator1", 54, 100, new Position(7, 6)));

        map = new Map(entityList, 10, 10);
        map.initField();

        renderer = new RendererImpl();
        for (Action initAction : initActions) {
            initAction.performAction(map);
        }

        while (isRunning) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            nextTurn();
        }
    }

    public void nextTurn() {
        for (Action turnAction : turnActions) {
            turnAction.performAction(map);
        }

        renderer.render(map);
    }

    public void pauseSimulation() {
    }
}
