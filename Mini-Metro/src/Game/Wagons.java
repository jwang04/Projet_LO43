package Game;

import java.util.LinkedList;
import java.util.List;

public class Wagons {
    private int             CapacityWagon = 6;
    private List<Passagers> passagers     = new LinkedList<Passagers>();

    public List<Passagers> GetPassagers() {
        return passagers;
    }

    public boolean IsFull() {
        return (passagers.size() >= CapacityWagon);
    }

    public Positions GetPosition() {

    }

    public Positions SetPosition(Positions position) {

    }

    public void GetOnW() {

    }

    public void GetOffW() {

    }
}
