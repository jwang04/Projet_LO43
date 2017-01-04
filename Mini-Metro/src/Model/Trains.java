package Model;

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
        this.passagers = new LinkedList<Passagers>();
        this.pos = new Positions();
    }

    public Trains(Positions position) {
        SetPosition(position);
        this.passagers = new LinkedList<Passagers>();
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

    public void SetPosition(Positions position) {
        pos = position;
    }

    public List<Wagons> GetWagons() {
        return wagons;
    }

    public void GetOnTrain() {

    }

    public void GetOffTrain() {

    }

    public void AddWagon(Wagons wag) {
        this.wagons.add(wag);
    }
}
