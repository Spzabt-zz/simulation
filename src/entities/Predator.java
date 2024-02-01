package entities;

import map.Position;

import java.util.Random;

public class Predator extends Creature {
    private final Random random;

    public Predator(String skin, String name, int speed, int hp, Position position) {
        super(skin, name, speed, hp, position);
        random = new Random();
    }

    @Override
    public void makeMove() {
        int x = random.nextInt(-1, 2);
        int y = random.nextInt(-1, 2);

        int x1 = getPosition().getX() + x;
        int y1 = getPosition().getY() + y;

        while ((x1 <= 0 || x1 >= 9) || (y1 <= 0 || y1 >= 9)) {
            x1 = getPosition().getX() + random.nextInt(-1, 2);
            y1 = getPosition().getY() + random.nextInt(-1, 2);
        }

        setPosition(new Position(
                x1,
                y1
        ));
    }

    public void attack(Herbivore herbivore) {
        if (Math.abs(getPosition().getX() - herbivore.getPosition().getX()) <= 2 &&
                Math.abs(getPosition().getY() - herbivore.getPosition().getY()) <= 2) {
            System.out.println("Near collision detected!");
            herbivore.setHp(herbivore.getHp() - 10);
        }
    }
}
