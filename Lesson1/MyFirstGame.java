public class MyFirstGame {

    public static void main(String[] args) {
        System.out.println("Guess Number");

        int guessNumber = 45;
        int playerNumber =50;
        do {
            if (playerNumber < guessNumber) {
                System.out.println("Number <");
                break;
            } else if (playerNumber > guessNumber) {
                System.out.println("Number >");
            }
                break;
        } while (playerNumber != guessNumber);

        System.out.println("You guessed it");
    }
}