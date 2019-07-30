import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        String answer = "yes";
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Enter first player name: ");
            Player playerOne = new Player(scan.next());

            System.out.print("Enter second player name: ");
            Player playerTwo = new Player(scan.next());

            GuessNumber game = new GuessNumber(playerOne, playerTwo);
            
            game.startGame();

            do {
                System.out.print("Want to continue? [yes/no]: ");
                answer = scan.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
        System.out.println("You tried .... Good luck");
    }
}