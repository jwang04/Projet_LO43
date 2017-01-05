package Controller;

import View.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.shape.*;

public class WindowController extends Application{
	
	private WindowView fenetre = new WindowView();
	private ButtonView button = new ButtonView();
	private Group root = new Group();
	
	 public static void main(String[] args) {
	        launch(args);
	    }

	    @Override
	    public void start(Stage stage) {
	        //exemple d'application
	        //Circle circle = new Circle(30,30,30);
	        //circle.setFill(Color.BLACK);
	        //circle.setTranslateX(600);
	        //circle.setTranslateY(400);
	        //root.getChildren().add(circle);
	        
	        Btn_Event(stage);
	        
	        button.SetBtn_Start();
	        button.SetBtn_Close();
	        fenetre.SetImage();
	        
	        root.getChildren().addAll( fenetre.GetIV(), button.GetBtn_Close(), button.GetBtn_Start());
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
		        		System.out.println("Quitter le jeu");
		        	}
		        });
		        
		        button.GetBtn_Start().setOnAction(new EventHandler<ActionEvent>(){

					@Override
					public void handle(ActionEvent event) {
						System.out.println("Commencer le jeu");
						//init();
					}
		        	
		        });
	    }
	    
	   // public void init(){
	    //	Rectangle rectangle = new Rectangle(30,30,30,30);
	    //	rectangle.setFill(Color.BLACK);
	    //	root.getChildren().add(rectangle);
	    //}

}
