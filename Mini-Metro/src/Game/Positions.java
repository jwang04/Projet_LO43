package Game;

/**
 * Created by Michel HUANG
 */

public class Positions {
    private int x, y;

    public Positions() {
        x = 0;
        y = 0;
    }

    public Positions(int X, int Y) {
        SetX(X);
        SetY(Y);
    }
    
    public void SetX(int X) {
        x = X;
    }

    public void SetY(int Y) {
        y = Y;
    }

    public int GetX() {
        return x;
    }

    public int GetY() {
        return y;
    }
}
