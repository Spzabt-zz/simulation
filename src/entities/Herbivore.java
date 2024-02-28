package entities;

import map.Position;

import java.util.Random;

public class Herbivore extends Creature {
    private final Random random;

    public Herbivore(String skin, String name, int speed, int hp, Position position) {
        super(skin, name, speed, hp, position);
        random = new Random();
    }

    @Override
    public void makeMove() {/*
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

        System.out.println(getName() + " left with " + getHp() + " hp");*/


    }

    public void eatGrass(Grass grass) {
        if (getPosition().getX() == grass.getPosition().getX() &&
                getPosition().getY() == grass.getPosition().getY()) {
            System.out.println("Grass and herbivore collided!");
            setHp(getHp() + 5);
        }
    }
}
