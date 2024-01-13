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

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (i == 0 || i == field.length - 1) {
                    field[i][j] = '#';
                } else if (j == 0 || j == field[i].length - 1) {
                    field[i][j] = '#';
                } else field[i][j] = '.';
            }
        }
    }

    public char[][] getField() {
        return field;
    }

    public List<Entity> getEntityList() {
        return entityList;
    }
}
