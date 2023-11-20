import java.util.Scanner;
public class NumberGuessingLogic {
    private Scanner scan;
    private int guessedNum;
    private NumberGuessing data;
    private String game;

    public NumberGuessingLogic(){
        scan = new Scanner(System.in);
        guessedNum = 0;
        game = null;
        data = new NumberGuessing();
        System.out.println("Welcome to the Number Guessing Game");
    }


    public void start(){
        gameStart();
    }

    private void gameStart(){
        System.out.print("Please select a mode (Easy, Medium, or Hard): ");
        game = scan.nextLine();
        data.setMode(game);
        data.gameMode();
        System.out.print("Please pick a number between the range: ");
        guessedNum = scan.nextInt();
        scan.nextLine();
        data.game(guessedNum);
        while (!data.getGameOver()){
            System.out.print("Please pick a number between the range: ");
            guessedNum = scan.nextInt();
            scan.nextLine();
            data.game(guessedNum);
        }
    }
}

