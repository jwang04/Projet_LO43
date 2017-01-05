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
	        
	        fenetre.GetBtn_Close().setOnAction(new EventHandler<ActionEvent>(){
	        	@Override
	        	public void handle(ActionEvent event){
	        		stage.close();
	        	}
	        });
	        
	        fenetre.GetBtn_Start().setOnAction(new EventHandler<ActionEvent>(){

				@Override
				public void handle(ActionEvent event) {
					// TODO Auto-generated method stub
					
				}
	        	
	        });
	        
	        fenetre.SetBtn_Start();
	        fenetre.SetBtn_Close();
	        
	        
	        root.getChildren().add(fenetre.GetBtn_Close());
	        root.getChildren().add(fenetre.GetBtn_Start());
	        
	        Scene scene = new Scene(root, fenetre.GetWitdh(), fenetre.GetHeight(), Color.TRANSPARENT);
	        stage.setTitle(fenetre.GetTitle());
	        
	        stage.setScene(scene);
	        stage.show();
	    }

}
