package model;

public class Player {
    String playername;
    int runs;
    String nation;

    public Player(String playername, int runs, String nation) {
        this.playername = playername;
        this.runs = runs;
        this.nation = nation;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }
}
