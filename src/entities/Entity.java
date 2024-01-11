package entities;

public abstract class Entity {
    private char skin;
    private String name;

    protected Entity(char skin, String name) {
        this.skin = skin;
        this.name = name;
    }

    public char getSkin() {
        return skin;
    }

    public void setSkin(char skin) {
        this.skin = skin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
