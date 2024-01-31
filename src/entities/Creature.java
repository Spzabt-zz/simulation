package entities;

import map.Position;

public abstract class Creature extends Entity {
    private int speed;
    private int hp;

    protected Creature(String skin, String name, /*int x, int y, */int speed, int hp, Position position) {
        super(skin, name, position);
        this.speed = speed;
        this.hp = hp;
    }

    public abstract void makeMove();

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
