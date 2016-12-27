package Game;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Michel HUANG
 */

public class Trains {
    private int             CapacityTrain = 6;
    private Positions       pos           = new Positions();
    private List<Passagers> passagers     = new LinkedList<Passagers>();
    private List<Wagons>    wagons        = new LinkedList<Wagons>();

    /**
     * Default constructor
     */

    public Trains() {
        passagers = new LinkedList<Passagers>();
        pos = new Positions();
    }

    public Trains(Positions position) {
        SetPosition(position);
        passagers = new LinkedList<Passagers>();
    }

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
        return pos = position;
    }

    public List<Wagons> GetWagons() {
        return wagons;
    }

    public void GetOnTrain() {

    }

    public void GetOffTrain() {

    }

    public void AddWagon(Wagons wag) {
        wagons.add(wag);
    }
}
