import entities.*;

public class Main {
    public static void main(String[] args) {
        Entity entity = new Grass('d', "dsd");
        System.out.println(entity.getName());
        Creature entity1 = new Herbivore('3', "herbivore", 34, 100);
        System.out.println(entity1.getHp());
        entity1.makeMove();

        Creature entity2 = new Predator('3', "Predator1", 34, 100);
        entity2.makeMove();

        Creature entity3 = new Predator('3', "Predator2", 34, 100);
        //entity3.attack();
    }
}
