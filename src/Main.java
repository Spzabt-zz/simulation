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
            System.out.println(entity.getName());
        }


    }
}
