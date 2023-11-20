public class NumberGuessing {
    private int ranNum;
    private String mode;
    private int guesses;
    private boolean gameOver;
    private int maxGuesses;

    public NumberGuessing(){
        mode = "";
        ranNum = 0;
        guesses = 0;
        maxGuesses = 0;
        gameOver = false;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public boolean getGameOver(){
        return gameOver;
    }

    public void gameMode(){
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
        } else{
            guesses = 0;
            maxGuesses = 10;
            ranNum = (int) (Math.random() * 100) + 1;
            System.out.println("Your range is numbers between 1 - 100");
        }
        System.out.println(ranNum);
    }

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

     public void game(int guess){
        String str = "";
        if (guess == ranNum){
            str = ("Congrats you won!" + "\n");
            str += ("It took you " + guesses + " guesses to get the correct answer");
            gameOver = true;
        } else{
            str = ("That is not the correct answer");
            hotOrCold(guess);
            guesses++;
            System.out.println("Guesses " + guesses);
            System.out.println();
        } if (maxGuesses == guesses){
             str = ("Game Over! you reach 10 guesses");
             gameOver = true;
         }
         System.out.println(str);
     }
}
