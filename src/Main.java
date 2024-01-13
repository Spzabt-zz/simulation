import entities.*;
import map.Map;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Entity entity = new Grass('d', "dsd");
//        System.out.println(entity.getName());
//        Creature entity1 = new Herbivore('3', "herbivore", 34, 100);
//        System.out.println(entity1.getHp());
//        entity1.makeMove();
//
//        Creature entity2 = new Predator('3', "Predator1", 34, 100);
//        entity2.makeMove();
//
//        Creature entity3 = new Predator('3', "Predator2", 34, 100);
//        Predator predator = (Predator) entity3;
//        predator.attack();


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

        for (Entity entity : entityList) {
            System.out.println("Entity: " + entity.getName() + ", Symbol: " + entity.getSkin());

            if (entity instanceof Creature creature) {
                // Perform Creature-specific actions or access Creature-specific methods
                if (creature instanceof Herbivore herbivore) {
                    System.out.println("Health: " + herbivore.getHp());
                    herbivore.makeMove();
                } else if (creature instanceof Predator predator) {
                    System.out.println("Strength: " + predator.getSpeed());
                    predator.makeMove();
                    predator.attack();
                }
            } else if (entity instanceof Tree tree) {
                System.out.println(tree.getName());

            }
        }

        Map map = new Map(null, 10, 50);
        map.initField();
        for (int i = 0; i < map.getField().length; i++) {
            for (int j = 0; j < map.getField()[i].length; j++) {
                System.out.print(map.getField()[i][j]);
            }
            System.out.println();
        }
    }
}
