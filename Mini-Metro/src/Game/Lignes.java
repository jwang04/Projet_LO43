package Game;

public class Lignes {
  private Stations Start = new Stations();
  private Stations Terminal = new Stations();
  private Color col = new Color();
  
  public Color GetColor(){
    return col;
  }
  
  public Stations GetStart(){
    return Start;
  }
  
  public Stations GetTerminal(){
    return Terminal;
  }
  
  public void SetColor(Color c){
    ////
  }
  
  public void SetStart(Stations s){
    ////
  }
  
  public void SetTerminal(Stations t){
    ////
  }
  
  public void NextRoutes(Trains train){
   //// 
  }
  
  public void Transfer(Trains train, Stations station){
   //// 
  }
  
  public boolean UTurn(){
    ////
  }
  
  public boolean IsCircular(){
    ////
  }
  
}
