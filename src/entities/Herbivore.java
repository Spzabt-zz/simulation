package entities;

public class Herbivore extends Creature {
    public Herbivore(char skin, String name, int speed, int hp) {
        super(skin, name, speed, hp);
    }

    @Override
    public void makeMove() {
        System.out.println("Herbivore is moving");
    }
}
