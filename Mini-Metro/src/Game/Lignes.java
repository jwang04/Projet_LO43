package Game;

import java.util.LinkedList;
import java.util.List;

public class Lignes {
    private Stations     Start    = new Stations();
    private Stations     Terminal = new Stations();
    private Color        col;
    private List<Trains> trains   = new LinkedList<Trains>();
    private List<Wagons> wagons   = new LinkedList<Wagons>();

    public Lignes(Color c, Stations s, Stations t) {
        this.col = c;
        this.Start = s;
        this.Terminal = t;
    }

    public Color GetColor() {
        return col;
    }

    public Stations GetStart() {
        return Start;
    }

    public Stations GetTerminal() {
        return Terminal;
    }

    public void SetColor(Color c) {
        this.col = c;
    }

    public void SetStart(Stations s) {
        this.Start = s;
    }

    public void SetTerminal(Stations t) {
        this.Terminal = t;
    }

    public void NextRoutes(Trains train) {

    }

    public void Transfer(Trains train, Stations station) {

    }

    public boolean UTurn() {

    }

    public boolean IsCircular() {
        return (Start == Terminal);
    }

    public void AddTrain(Trains train) {
        this.trains.add(train);
    }

    public void AddStation(Stations s) {
        Terminal.add(s);
    }

    public void AddWagon(Wagons wa) {
        this.wagons.add(wa);
    }
}
