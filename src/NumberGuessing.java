/**
 * this class represents the skeleton of my number guessing game
 * @author Papa Ndiaye
 */


public class NumberGuessing {
    /** The random Number generated */
    private int ranNum;
    /** The game mode */
    private String mode;
    /** The number of guesses the user has so far */
    private int guesses;
    /** boolean to see if the game is finished */
    private boolean gameOver;
    /** the max number of guesses per game */
    private int maxGuesses;

    /**
     * creates a Number Guessing Object
     */
    public NumberGuessing(String mode){
        /**
         * variables setted whenever the object is created
         */
        this.mode = mode;
        ranNum = 0;
        guesses = 0;
        maxGuesses = 0;
        gameOver = false;
    }


    /**
     * sets the gamemode to whatever the user inputs in the class
     * @param mode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * gets the boolean gameOver
     * @return whether the game is finished or not
     */

    public boolean getGameOver(){
        return gameOver;
    }

    /**
     * sets the gameMode based on user input
     * creates the random Number
     * and sets maxGuesses to 10
     */

    public void game(){
        if (mode.equals("easy")){
            guesses = 0;
            maxGuesses = 10;
            ranNum = (int) (Math.random() * 20) + 1;
            System.out.println("Your range is numbers between 1 - 20");
        }else if (mode.equals("medium")){
            guesses = 0;
            maxGuesses = 10;
            ranNum = (int) (Math.random() * 50) + 1;
            System.out.println("Your range is numbers between 1 - 50");
        } else if (mode.equals("hard")){
            guesses = 0;
            maxGuesses = 10;
            ranNum = (int) (Math.random() * 100) + 1;
            System.out.println("Your range is numbers between 1 - 100");
        }else{
            ranNum = (int) (Math.random() * 500) + 1;
            System.out.println("Your range is numbers between 1 - 500");
        }
        System.out.println(ranNum);
    }

    /**
     * prints out whether the user guess is close or far from the randomNumber
     * @param guess
     */

    private void hotOrCold(int guess){
        int random = (ranNum / 2);
        String answer = "";
        if (guess >= random){
            answer = "Your guess is Hot";
        } else{
            answer = "Your guess is Cold";
        }
        System.out.println(answer);
    }

     public void game(int guess) {
         String str = "";
             if (guess == ranNum) {
                 guesses++;
                 str = ("Congrats you won!" + "\n");
                 str += ("It took you " + guesses + " guesses to get the correct answer");
                 gameOver = true;
             } else {
                 str = ("That is not the correct answer");
                 hotOrCold(guess);
                 guesses++;
                 System.out.println("Guesses " + guesses);
                 System.out.println();
             }
            if (maxGuesses == guesses) {
                str = ("Game Over! you reach 10 guesses");
                gameOver = true;
            }
                System.out.println(str);
    }
}
