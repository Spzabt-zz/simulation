package entities;

public abstract class Creature extends Entity {
    private int speed;
    private int hp;

    protected Creature(char skin, String name, int speed, int hp) {
        super(skin, name);
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
