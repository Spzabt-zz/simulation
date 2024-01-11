package entities;

public class Predator extends Creature {
    public Predator(char skin, String name, int speed, int hp) {
        super(skin, name, speed, hp);
    }

    @Override
    public void makeMove() {
        System.out.println("Predator is moving");
    }

    public void attack() {
        System.out.println("Predator attacks");
    }
}
