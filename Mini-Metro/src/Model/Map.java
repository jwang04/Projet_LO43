package Model;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Michel HUANG
 */

public class Map {
    private Times           time      = new Times();
    private Scores          score     = new Scores();
    private List<Stations>  stations  = new LinkedList<Stations>();
    private List<Passagers> passagers = new LinkedList<Passagers>();
    private List<Wagons>    wagons    = new LinkedList<Wagons>();
    private List<Trains>    trains    = new LinkedList<Trains>();
    private Stations        sta       = new Stations();

    public void PutLignes(Lignes ligne) {

    }

    public void ExtendLigne(Lignes ligne, Stations station) {

    }

    public void AddTrains(Trains train) {
        trains.add(train);
    }

    public void AddStations(Stations station) {
        stations.add(station);
    }

    public void AddWagons(Wagons wa) {
        wagons.add(wa);
    }

    public void SetStations(Stations station) {
        sta = station;
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
        score.AddScores();
    }

    public void AddPassagers(Passagers passager) {
        passagers.add(passager);
    }
}
