package entities;

import map.Position;

public abstract class Entity {
    private String skin;
    private String name;
    private Position position;

    protected Entity(String skin, String name, Position position) {
        this.skin = skin;
        this.name = name;
        this.position = position;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
