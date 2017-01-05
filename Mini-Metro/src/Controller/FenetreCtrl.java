package Controller;

import View.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class FenetreCtrl extends Application{
	
	FenetreVue fenetre = new FenetreVue();
	ButtonView button = new ButtonView();
	
	 public static void main(String[] args) {
	        launch(args);
	    }

	    @Override
	    public void start(Stage stage) {
	    	
	        Group root = new Group();
	        //exemple d'application
	        //Circle circle = new Circle(30,30,30);
	        //circle.setFill(Color.BLACK);
	        //circle.setTranslateX(600);
	        //circle.setTranslateY(400);
	        //root.getChildren().add(circle);
	        
	        Btn_Event(stage);
	        
	        button.SetBtn_Start();
	        button.SetBtn_Close();
	        
	        root.getChildren().addAll(button.GetBtn_Close(), button.GetBtn_Start(), fenetre.GetIV());
	        Scene scene = new Scene(root, fenetre.GetWitdh(), fenetre.GetHeight(), Color.TRANSPARENT);
	        stage.setTitle(fenetre.GetTitle());
	        
	        stage.setScene(scene);
	        stage.show();
	    }
	    
	    public void Btn_Event(Stage stage){
	    	
	    	 button.GetBtn_Close().setOnAction(new EventHandler<ActionEvent>(){
		        	@Override
		        	public void handle(ActionEvent event){
		        		stage.close();
		        	}
		        });
		        
		        button.GetBtn_Start().setOnAction(new EventHandler<ActionEvent>(){

					@Override
					public void handle(ActionEvent event) {
						// TODO Auto-generated method stub
						
					}
		        	
		        });
	    }

}
