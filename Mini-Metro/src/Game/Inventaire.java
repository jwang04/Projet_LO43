package Game;

import java.util.LinkedList;
import java.util.List;

public class Inventaire {
  private int NumberPassagers;
  private int NumberWagons;
  private int NumberTrains;
  private int NbStation;
  private List<Lignes> lignes = new LinkedList<Lignes>();
  
  public Inventaire(){
      NumberPassagers = 0;
      NumberTrains = 0;
      NumberTrains = 0;
      NbStation = 0;
  }
  
  public int GetNbPassager(){
    return NumberPassagers;
  }
  
  public int GetNbWagons(){
    return NumberWagons;
  }
  
  public int GetNbTrains(){
    return NumberTrains;
  }
  
  public int GetNbStation(){
      return NbStation;
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
  
  public void SetNbStation(int NS){
      NbStation = NS; 
  }
  
  public List<Lignes> GetNbLignes(){
    return lignes;
  }
  
}
