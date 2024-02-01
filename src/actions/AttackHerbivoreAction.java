package actions;

import entities.Entity;
import entities.Herbivore;
import entities.Predator;
import map.Map;

import java.util.ArrayList;
import java.util.List;

public class AttackHerbivoreAction implements Action {

    @Override
    public void performAction(Map map) {
        List<Herbivore> herbivores = getHerbivores(map);

        for (Entity entity : map.getEntityList()) {
            if (entity instanceof Predator predator) {
                for (Herbivore herbivore : herbivores) {
                    predator.attack(herbivore);
                }
            }
        }
    }

    private List<Herbivore> getHerbivores(Map map) {
        List<Herbivore> herbivores = new ArrayList<>();

        for (Entity entity : map.getEntityList()) {
            if (entity instanceof Herbivore herbivore) {
                herbivores.add(herbivore);
            }
        }

        return herbivores;
    }
}
