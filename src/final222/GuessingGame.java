
package final222;



public class GuessingGame extends Game {
    private int winningNumber, numberOfTries, lastGuess;

    public GuessingGame() {
        newGame();  
    }

    public void setWinningNumber(int winningNumber) {
        this.winningNumber = winningNumber;
    }

    public int getNumberOfTries() {
        return numberOfTries;
    }

    public void setNumberOfTries(int numberOfTries) {
        this.numberOfTries = numberOfTries;
    }

    public int getLastGuess() {
        return lastGuess;
    }

    public void setLastGuess(int lastGuess) {
        this.lastGuess = lastGuess;
    }

    
    @Override
    public final void newGame() {
        winningNumber = (int)(Math.random() * 5) + 1;
        //System.out.println(winningNumber);
        this.lastGuess = 0;
        this.numberOfTries = 0;
        
    }

    @Override
    public boolean isGameOver() {
        if(winningNumber == lastGuess )
            return true;
        if(numberOfTries < 2)
            return false;
        else
            return true;
    }
    
    public boolean isWinningNumber(int num){
        boolean returnValue = false;
        if(!(num >= 1 && num <= 5))
            throw new InvalidPickException();
        if(isGameOver())
            throw new IllegalStateException("Game has already ended");
        if(!isGameOver() && (num >= 1 && num <= 5)){
            lastGuess = num;
            numberOfTries++;
            System.out.println("Number guessed: " + num);
            if(num == winningNumber){
                returnValue = true;
            } 
            
        }
        return returnValue;
    }
}

