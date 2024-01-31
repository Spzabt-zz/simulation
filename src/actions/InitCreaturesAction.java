package actions;

import entities.Entity;
import map.Map;

public class InitCreaturesAction implements Action {

    @Override
    public void performAction(Map map) {
        for (Entity entity : map.getEntityList()) {
            map.getField()[entity.getPosition().getX()][entity.getPosition().getY()] = entity.getSkin();
        }
    }
}
