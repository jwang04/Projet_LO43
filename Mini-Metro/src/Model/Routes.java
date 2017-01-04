package Model;

import java.util.LinkedList;
import java.util.List;

public class Routes {

    private Stations       StationStart   = new Stations();
    private Stations       StationArrival = new Stations();
    private List<Stations> stations       = new LinkedList<Stations>();

    public Routes(Stations start, Stations arrival) {
        SetStationStart(start);
        SetStationArrival(arrival);
    }

    public void SetStationStart(Stations start) {
        this.StationStart = start;
    }

    public void SetStationArrival(Stations arrival) {
        this.StationArrival = arrival;
    }

    public List<Stations> GetRoute() {
        return stations;
    }

    public Stations GetStationStart() {
        return StationStart;
    }

    public Stations GetStationArrival() {
        return StationArrival;
    }

}
