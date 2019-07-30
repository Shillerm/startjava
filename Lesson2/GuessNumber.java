import java.util.Scanner;

public class GuessNumber {
    
    private int computerNumber;
    private Player playerOne;
    private Player playerTwo;
    private boolean isWin;
    private Scanner scan = new Scanner(System.in);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void startGame() {
    	isWin = false;
            computerNumber = (int) (Math.random() * 101);
        do {
            inputUserNumber(playerOne);
            guessNumber(playerOne);
            inputUserNumber(playerTwo);
            guessNumber(playerTwo);
        } while (!isWin);
    }

    private void inputUserNumber(Player player) {
        System.out.println(player.getName() + ", enter number: ");
        player.setNumber(scan.nextInt());
        if(player.getNumber() < 1 || player.getNumber() > 100);
        	System.out.println("Guess the number of the computer from 1 to 100");
    }

    private void guessNumber(Player player) {
        if(player.getNumber() == computerNumber) {
        	System.out.println(player.getName() + ", you won!");
        	isWin = true;
        } else if (player.getNumber() < computerNumber) {
        	System.out.println(player.getName() + ", the number you entered is less than the computer wished for");
        } else if (player.getNumber() > computerNumber) {
        	System.out.println(player.getName() + ", the number you entered is more than the computer wished for");
        }
    }
}