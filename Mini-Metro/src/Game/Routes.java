package Game;

import java.util.LinkedList;
import java.util.List;

public class Routes {
  
  private Stations StationStart = new Stations();
  private Stations StationArrival = new Stations();
  private List<Stations> stations = new LinkedList<Stations>();
  
  public void SetStationStart(Stations start){
    StationStart = start;
  }
  
  public void SetStationArrival(Stations arrival){
    StationArrival = arrival;
  }
  
  public List<Stations> GetRoute(){
    return stations;
  }
  
  public Stations GetStationStart(){
    return StationStart;
  }
  
  public Stations GetStationArrival(){
    return StationArrival;
  }
  
}
