package Model;

import java.util.List;
import java.util.LinkedList;

public class Stations {
	private float TempsApparition;
	private int CapacityStation;
	private Shape type;
	private Positions position;
	private List<Passagers> waiters = new LinkedList<Passagers>();
	
	public Stations(){
		this.TempsApparition = 0;
		this.CapacityStation = 0;
	}
	
	public Stations(Shape t, Positions pos){
		
	}
	
	public Shape GetType(){
		return type;
	}
	
	public void SetTypeShape(Shape t){
		this.type = t;
	}
	
	public Positions GetPosition(){
		return position;
	}
	
	public void SetPosition(Positions pos){
		this.position = pos;
	}
	
	public List<Passagers> GetWaiters(){
		return waiters;
	}
	
	public Shape AddRandomStation(){
		
	}
	
}
