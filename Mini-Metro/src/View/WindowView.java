package View;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class WindowView {
	private double Witdh = 1200;
	private double Height = 800;
	private String Title = "Mini-Metro";
	private String URL = "/Resource/Background.png";
	
	Image ImageBack = new Image(URL, true);
	ImageView iv = new ImageView(ImageBack);
	
	public void SetImage(){
		iv.setFitHeight(Height);
		iv.setFitWidth(Witdh);
		iv.setSmooth(true);
		iv.setImage(ImageBack);
		//System.out.println("Image loaded");
	}
	
	public ImageView GetIV(){
		return iv;
	}
	
	public Image GetImage(){
		return ImageBack;
	}
	
	public double GetWitdh() {
		return Witdh;
	}
	
	public double GetHeight(){
		return Height;
	}
	
	public String GetTitle(){
		return Title;
	}
	
}
