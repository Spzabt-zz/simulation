package renderer;

import map.Map;

public class Renderer {
    private final Map map;

    public Renderer(Map map) {
        this.map = map;
    }

    public void render(int x, int y, char entity) {
        map.getField()[x][y] = entity;
    }
}
