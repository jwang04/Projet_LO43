package View;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class FenetreVue {
	private double Witdh = 1200;
	private double Height = 800;
	private String Title = "Mini-Metro";
	private String URL = "file:/Background.png";
	
	Image ImageBack = new Image(URL, true);
	ImageView iv = new ImageView();
	
	public void SetImage(){
		iv.setImage(ImageBack);
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
