public class NumberGuessing {
    private int ranNum;
    private String mode;
    private int guesses;


    public NumberGuessing(){
        mode = "";
        ranNum = 0;
        guesses = 0;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public void gameMode(){
        if (mode.equals("easy")){
            guesses = 10;
            ranNum = (int) (Math.random() * 20) + 1;
        }else if (mode.equals("medium")){
            guesses = 10;
            ranNum = (int) (Math.random() * 50) + 1;
        } else{
            guesses = 10;
            ranNum = (int) (Math.random() * 100) + 1;
        }
    }
    private String hotOrCold(int guess){
        int random = (ranNum / 2);
        String answer = "";
        if (guess >= random){
            answer = "Your guess is Hot";
        } else{
            answer = "Your guess is Cold";
        }
        return answer;
    }
     public String game(int guess){
        String str = "";
        if (guess == ranNum){
            str = ("Congrats you won" + "\n");
            str += ("It took you " + guesses + " to get the correct answer");
        } else{
            str = ("That is not the correct answer");
            hotOrCold(guess);
            guesses++;
        } if (guesses == 10){
            str = ("Game Over! you reach 10 guesses");
         }
        return str;
    }
}
