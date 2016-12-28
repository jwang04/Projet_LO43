package Game;

public class Scores {

    private int points;

    public Scores() {
        points = 0;
    }

    public void AddScores() {
        points++;
    }

    public int GetScore() {
        return points;
    }

}
