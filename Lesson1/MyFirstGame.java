public class MyFirstGame {

    public static void main(String[] args) {
        System.out.println("Guess Number");

        int guessNumber = 45;
        int playerNumber = 60;
        while (guessNumber != playerNumber) {
            if (playerNumber > guessNumber) {
                System.out.println("Number <");
            playerNumber--;
        } else {
            System.out.println("Number >");
            playerNumber++;
        }
    }

        System.out.println("You guessed it");
    }
}