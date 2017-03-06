package View;

import Model.Shape;
import javafx.scene.shape.Polygon;

public class TriangleView extends Polygon{

	private double centerX, centerY;
	
	public TriangleView(double Xcenter, double Ycenter){
		
	}
	
	public double GetCenterX(){
		return centerX;
	}
	
	public double GetCenterY(){
		return centerY;
	}
}
