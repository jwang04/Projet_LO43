package Game;

import java.util.LinkedList;
import java.util.List;

public class Trains {
    private int             CapacityTrain = 6;
    private Positions       pos           = new Positions();
    private List<Passagers> passagers     = new LinkedList<Passagers>();

    public List<Passagers> GetPassagers() {
        return passagers;
    }

    public boolean IsFull() {
        return (passagers.size() >= CapacityTrain);
    }

    public Positions GetPosition() {
        return pos;
    }

    public Positions SetPosition(Positions position) {

    }

    public List<Wagons> GetWagons() {

    }

    public void GetOnTrain() {

    }

    public void GetOffTrain() {

    }
}
