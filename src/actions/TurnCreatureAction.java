package actions;

import entities.Creature;
import entities.Entity;
import map.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TurnCreatureAction implements Action {
    private static final List<Creature> deadCreatures = new ArrayList<>();

    @Override
    public void performAction(Map map) {
        for (Entity entity : map.getEntityList()) {
            if (entity instanceof Creature creature) {
                map.getField()[creature.getPosition().getX()][creature.getPosition().getY()] = ".";
                if (creature.isAlive()) {
                    creature.makeMove();
                    map.getField()[creature.getPosition().getX()][creature.getPosition().getY()] = creature.getSkin();
                } else deadCreatures.add(creature);
            }
        }

        map.getEntityList().removeAll(deadCreatures);
    }
}
