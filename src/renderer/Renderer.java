package renderer;

import entities.Entity;
import map.Map;

public class Renderer {
    private final Map map;

    public Renderer(Map map) {
        this.map = map;
    }

    public void render(int x, int y, Entity entity) {
        map.getField()[x][y] = entity.getSkin();
    }
}
