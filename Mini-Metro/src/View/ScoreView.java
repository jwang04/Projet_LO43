package View;

import Model.Scores;
import javafx.scene.text.Font;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.control.Label;

public class ScoreView {
	private Label LScore= new Label();
	private Label LScore2 = new Label();
	Model.Scores points = new Model.Scores();
	
	
	public void SetScore(){
		LScore.textProperty().bind(new SimpleIntegerProperty(points.GetScore()).asString());
		LScore2.setText("Score : ");
		LScore.setFont(new Font(20));
		LScore2.setFont(new Font(20));
		LScore.setTranslateX(100);
		LScore.setTranslateY(0);
		LScore2.setTranslateX(0);
		LScore2.setTranslateY(0);
	}
	
	public void IncreaseScore(){
		LScore.textProperty().bind(new SimpleIntegerProperty(points.GetScore()).asString());
		points.AddScores();
		//System.out.println(points.GetScore());
	}
	
	public Label GetScore(){
		return LScore;
	}
	
	public Label GetLScore(){
		return LScore2;
	}
	
	public void VisibleLabel(){
		LScore.setVisible(true);
		LScore2.setVisible(true);
	}
	
	public void NoVisibleLabel(){
		LScore.setVisible(false);
		LScore2.setVisible(false);
	}
}
