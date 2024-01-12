package map;

import entities.Entity;

import java.util.List;

public class Map {
    private final List<Entity> entityList;
    private final int rows;
    private final int cols;
    private char[][] field;

    public Map(List<Entity> entityList, int rows, int cols) {
        this.entityList = entityList;
        this.rows = rows;
        this.cols = cols;
    }

    public void initField() {
        field = new char[rows][cols];
    }

    public char[][] getField() {
        return field;
    }

    public List<Entity> getEntityList() {
        return entityList;
    }
}
