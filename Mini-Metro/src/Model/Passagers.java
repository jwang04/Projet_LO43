package Model;

public class Passagers {
	private float TpsAppPassager;
	private float TpsAttentePassager;
	private Shape type;
	
	public Passagers(){
		this.TpsAppPassager = 0;
		this.TpsAttentePassager = 0;
	}
	
	public Passagers(Shape t, Stations stations){
		
	}
	
	public Shape GetType(){
		return type;
	}
	
	public void SetDestination(Shape destination){
		this.type = destination;
	}
}
