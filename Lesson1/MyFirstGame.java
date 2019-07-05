public class MyFirstGame {

    public static void main(String[] args) {
        
        System.out.println("Guess Number");
        
        int guessNumber = 45;
        int playerNumber;

        do {
            playerNumber = scan.nextInt();
            if (playerNumber < guessNumber) {
                System.out.println("Number <");
            } else if (playerNumber > guessNumber) {
                System.out.println("Number >");
            } else {
                break;
            }
        } while (playerNumber != guessNumber);
               
        System.out.println("Поздравляю, ты угадал!");                         
    }
}