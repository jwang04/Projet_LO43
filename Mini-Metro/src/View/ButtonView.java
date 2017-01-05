package View;

import javafx.scene.control.Button;

public class ButtonView {

	private double btn_witdh = 250;
	private double btn_height = 100;

	Button btn_start = new Button();
	Button btn_close = new Button();
		
	public Button GetBtn_Start(){
		return btn_start;
	}
	
	public void SetBtn_Start(){
		btn_start.setText("Commencer");
		btn_start.setTranslateX(500);
        btn_start.setTranslateY(250);
        btn_start.setMinSize(btn_witdh, btn_height);
        btn_start.setStyle("-fx-font-size: 50");
        //System.out.println("Button Start added");
	}
	
	public Button GetBtn_Close(){
		return btn_close;
	}
	
	public void SetBtn_Close(){
		btn_close.setText("Quitter");
		btn_close.setTranslateX(500);
        btn_close.setTranslateY(400);
        btn_close.setMinSize(btn_witdh, btn_height);
        btn_close.setStyle("-fx-font-size:50");
        //System.out.println("Button Close added");
	}
}
