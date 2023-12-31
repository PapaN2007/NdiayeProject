import java.util.Scanner;
public class NumberGuessingLogic {
    private Scanner scan;
    private int guessedNum;
    private NumberGuessing data;
    private String game;

    public NumberGuessingLogic(){
        scan = new Scanner(System.in);
        guessedNum = 0;
        game = "";
        System.out.println("Welcome to the Number Guessing Game");
    }


    public void start(){
        gameStart();
    }

    private void gameStart(){
        System.out.print("Please select a mode (Easy, Medium, Hard, or Impossible): ");
        game = scan.nextLine();
        data = new NumberGuessing(game);
        gameMode(game);
        newGuess();
        while (!data.getGameOver()){
            newGuess();
        }
    }
    private void newGuess(){
        System.out.print("Please pick a number between the range: ");
        guessedNum = scan.nextInt();
        scan.nextLine();
        data.game(guessedNum);
    }
    private void gameMode(String game){
        data.setMode(game);
        data.game();
    }
}

