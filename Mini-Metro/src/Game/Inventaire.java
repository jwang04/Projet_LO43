package Game;

import java.util.LinkedList;
import java.util.List;

public class Inventaire {
  private int NumberPassagers;
  private int NumberWagons;
  private int NumberTrains;
  
  public int GetNbPassager(){
    return NumberPassagers;
  }
  
  public int GetNbWagons(){
    return NumberWagons;
  }
  
  public int GetNbTrains(){
    return NumberTrains;
  }
  
  public void SetNbPassagers(int NP){
    NumberPassagers = NP;
  }
  
  public void SetNbWagons(int NW){
    NumberWagons = NW;
  }
  
  public void SetNbTrains(int NT){
    NumberTrains = NT;
  }
  
  public list<Lignes> GetNbLignes(){
    
  }
  
}
