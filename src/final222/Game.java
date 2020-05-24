
package final222;


public abstract class Game {
    private String playerName;
    public abstract void newGame();
    public abstract boolean isGameOver();

    public String getName() {
        return playerName;
    }

    public void setName(String name) {
        this.playerName = name;
    }
    
    
}
