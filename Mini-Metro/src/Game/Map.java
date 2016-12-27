package Game;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Michel HUANG
 */

public class Map {
    private Times  time  = new Times();
    private Scores score = new Scores();
    private List<Stations> stations = new LinkedList<Stations>();
    private List<Passagers> passagers = new LinkedList<Passagers>();

    public void PutLignes(Lignes ligne) {

    }

    public void ExtendLigne(Lignes ligne, Stations station) {

    }

    public void AddStations(Stations station) {
        stations.add(station);
    }

    public void SetStations(Stations station) {

    }

    public List<Stations> GetStations() {
        return stations;
    }

    public Times GetTimes() {
        return time;
    }

    public Scores GetScores() {
        return score;
    }

    public void SetScores() {

    }
    
    public void AddPassagers(Passagers passager){
        passagers.add(passager);
    }
}
