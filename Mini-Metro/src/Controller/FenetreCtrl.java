package Controller;

import View.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;


public class FenetreCtrl extends Application{
	
	 public static void main(String[] args) {
	        launch(args);
	    }

	    @Override
	    public void start(Stage stage) {
	        final double width = 1200;
	        final double height = 800;
	        Group root = new Group();
	        //exemple d'application
	        //Circle circle = new Circle(30,30,30);
	        //circle.setFill(Color.BLACK);
	        //circle.setTranslateX(600);
	        //circle.setTranslateY(400);
	        //root.getChildren().add(circle);
	        
	        Button btn_start = new Button();
	        btn_start.setText("Commencer");
	        Button btn_close = new Button();
	        btn_close.setText("Quitter");
	        btn_close.setOnAction(new EventHandler<ActionEvent>(){
	        	@Override
	        	public void handle(ActionEvent event){
	        		stage.close();
	        	}
	        });
	        btn_start.setTranslateX(600);
	        btn_start.setTranslateY(400);
	        btn_start.setMaxWidth(500);
	        btn_close.setTranslateX(600);
	        btn_close.setTranslateY(500);
	        root.getChildren().add(btn_close);
	        root.getChildren().add(btn_start);
	        //Image image = new Image("/header.jpg",true);
	       // Image image = new Image("header.jpg");
	        //BackgroundImage imageB = new BackgroundImage(image, null, null, null,null);
	        Scene scene = new Scene(root, width, height, Color.TRANSPARENT);
	        stage.setTitle("Mini-Metro");
	        
	        stage.setScene(scene);
	        stage.show();
	    }
}
