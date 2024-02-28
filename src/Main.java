import actions.AttackHerbivoreAction;
import actions.InitCreaturesAction;
import actions.TurnCreatureAction;
import map.PathFinder;
import map.Position;
import map.Vector;
import simulation.Simulation;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Simulation simulation = new Simulation();
//        simulation.addInitAction(new InitCreaturesAction());
//        simulation.addTurnAction(new TurnCreatureAction());
//        simulation.addTurnAction(new AttackHerbivoreAction());
//
//        simulation.startSimulation();

        PathFinder.Graph g = new PathFinder.Graph(7);

        g.addVertexData(0, 'A');
        g.addVertexData(1, 'B');
        g.addVertexData(2, 'C');
        g.addVertexData(3, 'D');
        g.addVertexData(4, 'E');
        g.addVertexData(5, 'F');
        g.addVertexData(6, 'G');

        g.addEdge(3, 0); // D - A
        g.addEdge(0, 2); // A - C
        g.addEdge(0, 3); // A - D
        g.addEdge(0, 4); // A - E
        g.addEdge(4, 2); // E - C
        g.addEdge(2, 5); // C - F
        g.addEdge(2, 1); // C - B
        g.addEdge(2, 6); // C - G
        g.addEdge(1, 5); // B - F

        g.printGraph();

        System.out.println("\nDepth First Search starting from vertex D:");
        g.dfs('D');

        System.out.println("\nBreadth First Search starting from vertex D:");
        g.bfs('D' , 'G');


        /*Vector[][] grid = new Vector[][] {
                new Vector[] {new Vector(0,0, 1),new Vector(0,1, 1),new Vector(0,2, 1),new Vector(0,3, 1),new Vector(0,4, 1),new Vector(0,5, 1),new Vector(0,0, 1),},
                new Vector[] {new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),},
                new Vector[] {new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),},
                new Vector[] {new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),},
                new Vector[] {new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),},
                new Vector[] {new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),},
                new Vector[] {new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),new Vector(0,0, 1),},

        };*/

        Vector[][] grid = new Vector[7][7];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                grid[i][j] = new Vector(i, j, 1);
            }
        }

        grid[0][2] = new Vector(0, 2, 0);
        grid[1][2] = new Vector(1, 2, 0);
        grid[1][3] = new Vector(1, 3, 0);
        grid[2][2] = new Vector(2, 2, 0);
        grid[2][3] = new Vector(2, 3, 0);
        grid[3][2] = new Vector(3, 2, 0);
        grid[4][2] = new Vector(4, 2, 0);
        grid[4][4] = new Vector(4, 4, 0);
        grid[5][4] = new Vector(5, 4, 0);
        grid[5][5] = new Vector(5, 5, 0);
        grid[6][4] = new Vector(6, 4, 0);
        grid[6][5] = new Vector(6, 5, 0);

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println();
        }

        g.bfsGridPathFinder(grid[0][0], grid[6][6], grid);
    }
}
