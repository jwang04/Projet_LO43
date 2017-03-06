package Controller;

import View.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.stage.WindowEvent;

public class WindowController extends Application{
	
	private WindowView fenetre = new WindowView();
	private ButtonView button = new ButtonView();
	private ScoreView score = new ScoreView();
	private TimesView clock = new TimesView();
	private Group root = new Group();
	
	 public static void main(String[] args) {
	        launch(args);
	    }

	    @Override
	    public void start(Stage stage) {
	    	Btn_Event(stage);
	        
	        Scene scene = new Scene(root, fenetre.GetWitdh(), fenetre.GetHeight(), Color.TRANSPARENT);
	        stage.setTitle(fenetre.GetTitle());
	        stage.setScene(scene);
	        stage.show();
	        stage.setResizable(false);
	        ExitApp(stage);
	    }
	    
	    public void ExitApp(Stage stage){
	    	stage.setOnCloseRequest(new EventHandler<WindowEvent>(){
	    		public void handle(WindowEvent we){
	    			System.out.println("Quitter le jeu");
	    			clock.stop();
	    			System.exit(0);	    			
	    			
	    		}
	    	});
	    }
	    
	    public void Btn_Event(Stage stage){
	    	
	    	 button.GetBtn_Close().setOnAction(new EventHandler<ActionEvent>(){
		        	@Override
		        	public void handle(ActionEvent event){
		        		stage.close();
		        		clock.stop();
		        		System.out.println("Quitter le jeu");
		        	}
		        });
		        
		        button.GetBtn_Start().setOnAction(new EventHandler<ActionEvent>(){

					@Override
					public void handle(ActionEvent event) {
						System.out.println("Commencer le jeu");
						initGame();
					}
		        	
		        });
		        
		        button.GetBtn_Pause().setOnAction(new EventHandler<ActionEvent>(){

					@Override
					public void handle(ActionEvent arg0) {
						//clock.pause();
						button.DisableBtn_Pause();
						button.NoDisableBtn_Continue();
						score.IncreaseScore();
					}
		        	
		        });
		        
		        button.GetBtn_Continue().setOnAction(new EventHandler<ActionEvent>(){

					@Override
					public void handle(ActionEvent arg0) {
						//clock.continu;
						button.DisableBtn_Continue();
						button.NoDisableBtn_Pause();
					}
		        	
		        });
		            
	    }
	    
	    public void init(){
	        button.SetAllBtn();
	        button.VisibleBtn1();
	        score.SetScore();
	        score.NoVisibleLabel();
	        clock.setPosition(900, 0);
	        root.getChildren().addAll(clock, button.GetBtn_Close(), button.GetBtn_Start(), score.GetScore(), score.GetLScore());
	    }
	    
	    public void initGame(){
	    	StationsView<CercleView> circleStation = new StationsView<CercleView>(new CercleView(300,300,30));
	        StationsView<SquareView> squareStation = new StationsView<SquareView>(new SquareView(300,300,30));
	        StationsView<TriangleView> triangleStation = new StationsView<TriangleView>(new TriangleView(400,600,30));
	        button.VisibleBtn2();
	        score.VisibleLabel();
	        button.NoVisibleBtn1();
	        button.DisableBtn_Continue();
	        clock.start();
	    	root.getChildren().addAll(circleStation.GetType(), squareStation.GetType(), triangleStation.GetType(), button.GetBtn_Pause(), button.GetBtn_Continue());
	    }

}
