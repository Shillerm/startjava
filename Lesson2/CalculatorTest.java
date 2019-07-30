import java.util.Scanner;

class CalculatorTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calc = new Calculator();
		char response;

		do {
			System.out.println("Enter first number: ");
			int firstNumber = scanner.nextInt();

			System.out.println("Enter the sign of the mathematical operation: ");
			char mathOperation = scanner.next().charAt(0);

			System.out.println("Enter second number: ");
			int secondNumber = scanner.nextInt();

			calc.setFirstNumber(firstNumber);
			calc.setMathOperation(mathOperation);
			calc.setSecondNumber(secondNumber);

			int result = calc.calculate();
			System.out.println(firstNumber + " " + mathOperation + " " + secondNumber + " = " + result);
        
			do {
        	System.out.println("Want to continue? [Yes/No]");
        	response = scanner.next().charAt(0);
        	} while (response != 'Y' && response != 'N');
    	} while (response == 'Y');
    }
}