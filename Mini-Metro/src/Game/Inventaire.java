package Game;

import java.util.LinkedList;
import java.util.List;

public class Inventaire {
    private int          NumberPassagers;
    private int          NumberWagons;
    private int          NumberTrains;
    private int          NbStation;
    private List<Lignes> lignes = new LinkedList<Lignes>();

    public Inventaire() {
        this.NumberPassagers = 0;
        this.NumberTrains = 0;
        this.NumberTrains = 0;
        this.NbStation = 0;
    }

    public Inventaire(int NP, int NW, int NT, int NS) {
        SetNbPassagers(NP);
        SetNbWagons(NW);
        SetNbTrains(NT);
        SetNbStation(NS);
    }

    public int GetNbPassager() {
        return NumberPassagers;
    }

    public int GetNbWagons() {
        return NumberWagons;
    }

    public int GetNbTrains() {
        return NumberTrains;
    }

    public int GetNbStation() {
        return NbStation;
    }

    public void SetNbPassagers(int NP) {
        this.NumberPassagers = NP;
    }

    public void SetNbWagons(int NW) {
        this.NumberWagons = NW;
    }

    public void SetNbTrains(int NT) {
        this.NumberTrains = NT;
    }

    public void SetNbStation(int NS) {
        this.NbStation = NS;
    }

    public List<Lignes> GetNbLignes() {
        return lignes;
    }

}
