import actions.AttackHerbivoreAction;
import actions.InitCreaturesAction;
import actions.TurnCreatureAction;
import simulation.Simulation;

public class Main {
    public static void main(String[] args) {
        Simulation simulation = new Simulation();
        simulation.addInitAction(new InitCreaturesAction());
        simulation.addTurnAction(new TurnCreatureAction());
        simulation.addTurnAction(new AttackHerbivoreAction());

        simulation.startSimulation();
    }
}
