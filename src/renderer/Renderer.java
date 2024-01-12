package renderer;

import map.Map;

public class Renderer {
    private final Map map;

    public Renderer(Map map) {
        this.map = map;
    }

    public void render(boolean isRunning) {
        while(isRunning) {
            // do render
        }
    }
}
