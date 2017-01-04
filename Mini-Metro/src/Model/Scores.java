package Game;

public class Scores {

    private int points;

    public Scores() {
        this.points = 0;
    }

    public void AddScores() {
        this.points++;
    }

    public int GetScore() {
        return points;
    }

}
