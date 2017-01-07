package View;

import javafx.scene.control.Button;

public class ButtonView {

	private double btn_witdh = 250;
	private double btn_height = 100;

	Button btn_start = new Button();
	Button btn_close = new Button();
	Button btn_pause = new Button();
	Button btn_continue = new Button();
		
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
	
	public void NoVisibleBtn1(){
		btn_start.setVisible(false);
		btn_close.setVisible(false);
	}
	
	public void NoVisibleBtn2(){
		btn_pause.setVisible(false);
		btn_continue.setVisible(false);
	}
	
	public void VisibleBtn1(){
		btn_start.setVisible(true);
		btn_close.setVisible(true);
	}
	
	public void VisibleBtn2(){
		btn_pause.setVisible(true);
		btn_continue.setVisible(true);
	}
	
	public void SetBtn_Pause(){
		btn_pause.setText("Pause");
		btn_pause.setMinSize(10, 30);
        btn_pause.setStyle("-fx-font-size: 20");
		btn_pause.setTranslateX(1050);
        btn_pause.setTranslateY(0);
      //System.out.println("Button Pause added");
    }
	
	public void SetBtn_Continue(){	
		btn_continue.setText("Continue");		
        btn_continue.setMinSize(10, 30);
        btn_continue.setStyle("-fx-font-size: 20");
		btn_continue.setTranslateX(1050);
        btn_continue.setTranslateY(50);
      //System.out.println("Button Continue added");	
	}
	
	public Button GetBtn_Pause(){
		return btn_pause;
	}
	
	public Button GetBtn_Continue(){
		return btn_continue;
	}
	
	public void SetAllBtn(){
		SetBtn_Continue();
		SetBtn_Pause();
		SetBtn_Close();
		SetBtn_Start();
	}
	
	public void DisableBtn_Pause(){
		btn_pause.setDisable(true);
	}
	
	public void NoDisableBtn_Pause(){
		btn_pause.setDisable(false);
	}
	
	public void NoDisableBtn_Continue(){
		btn_continue.setDisable(false);
	}
	
	public void DisableBtn_Continue(){
		btn_continue.setDisable(true);
	}
}
