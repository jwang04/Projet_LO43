package Game;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Michel HUANG
 */

public class Wagons {
    private int             CapacityWagon = 6;
    private List<Passagers> passagers     = new LinkedList<Passagers>();
    private Positions       pos           = new Positions();

    public Wagons() {
        passagers = new LinkedList<Passagers>();
        pos = new Positions();
    }

    public List<Passagers> GetPassagers() {
        return passagers;
    }

    public boolean IsFull() {
        return (passagers.size() >= CapacityWagon);
    }

    public Positions GetPosition() {
        return pos;
    }

    public Positions SetPosition(Positions position) {
        return pos = position;
    }

    public void GetOnW() {

    }

    public void GetOffW() {

    }
}
