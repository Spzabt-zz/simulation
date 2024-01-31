package actions;

import entities.Creature;
import entities.Entity;
import map.Map;

public class TurnCreatureAction implements Action {

    @Override
    public void performAction(Map map) {
        for (Entity entity : map.getEntityList()) {
            if (entity instanceof Creature creature) {
                map.getField()[creature.getPosition().getX()][creature.getPosition().getY()] = ".";
                creature.makeMove();
                map.getField()[creature.getPosition().getX()][creature.getPosition().getY()] = creature.getSkin();
            }
        }
    }
}
