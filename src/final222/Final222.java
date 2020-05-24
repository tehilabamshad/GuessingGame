
package final222;

import java.util.Scanner;


public class Final222 {

    
    public static void main(String[] args) {
        GuessingGame game;
        Scanner input = new Scanner(System.in);
        int numGuessed;
        int rounds = 3;
        
        
        for(int i = 1; i<=rounds; i++)
        {
            System.out.println("Game #" + (i));
            game = new GuessingGame();
            
            for(int j=0; j<2 && !(game.isGameOver()); j++){
            System.out.println("Please guess a number 1-5");
            numGuessed = input.nextInt();
            
            if(game.isWinningNumber(numGuessed))
                System.out.println("You won!");  
             else 
                System.out.println("Not the winning number");
            
            
            if(game.isGameOver()){
                System.out.println("Game over");
                System.out.println("");
            }
            
        }
    }
    
}
}
