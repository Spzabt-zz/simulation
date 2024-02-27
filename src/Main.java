import actions.AttackHerbivoreAction;
import actions.InitCreaturesAction;
import actions.TurnCreatureAction;
import map.PathFinder;
import simulation.Simulation;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Simulation simulation = new Simulation();
        simulation.addInitAction(new InitCreaturesAction());
        simulation.addTurnAction(new TurnCreatureAction());
        simulation.addTurnAction(new AttackHerbivoreAction());

        simulation.startSimulation();

//        PathFinder.Graph g = new PathFinder.Graph(7);
//
//        g.addVertexData(0, 'A');
//        g.addVertexData(1, 'B');
//        g.addVertexData(2, 'C');
//        g.addVertexData(3, 'D');
//        g.addVertexData(4, 'E');
//        g.addVertexData(5, 'F');
//        g.addVertexData(6, 'G');
//
//        g.addEdge(3, 0); // D - A
//        g.addEdge(0, 2); // A - C
//        g.addEdge(0, 3); // A - D
//        g.addEdge(0, 4); // A - E
//        g.addEdge(4, 2); // E - C
//        g.addEdge(2, 5); // C - F
//        g.addEdge(2, 1); // C - B
//        g.addEdge(2, 6); // C - G
//        g.addEdge(1, 5); // B - F
//
//        g.printGraph();
//
//        System.out.println("\nDepth First Search starting from vertex D:");
//        g.dfs('D');
//
//        System.out.println("\nBreadth First Search starting from vertex D:");
//        g.bfs('C' , 'F');
    }
}
