package View;

import javafx.scene.control.Button;

public class FenetreVue {
	private double Witdh = 1200;
	private double Height = 800;
	private String Title = "Mini-Metro";
	Button btn_start = new Button();
	Button btn_close = new Button();
	
	
	public double GetWitdh() {
		return Witdh;
	}
	
	public double GetHeight(){
		return Height;
	}
	
	public String GetTitle(){
		return Title;
	}
	
	public Button GetBtn_Start(){
		return btn_start;
	}
	
	public void SetBtn_Start(){
		btn_start.setText("Commencer");
		btn_start.setTranslateX(600);
        btn_start.setTranslateY(400);
	}
	
	public Button GetBtn_Close(){
		return btn_close;
	}
	
	public void SetBtn_Close(){
		btn_close.setText("Quitter");
		btn_close.setTranslateX(600);
        btn_close.setTranslateY(500);
	}
}
