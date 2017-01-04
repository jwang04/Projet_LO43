package Controller;

import View.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

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
	        //root.getChildren().add(circle);
	        Scene scene = new Scene(root, width, height, Color.TRANSPARENT);
	        stage.setTitle("Mini-Metro");
	        
	        stage.setScene(scene);
	        stage.show();
	    }
}
