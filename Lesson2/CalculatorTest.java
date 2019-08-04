import java.util.Scanner;

class CalculatorTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calc = new Calculator();
		char response;

		do {
			System.out.println("Enter first number: ");
			calc.setFirstNumber(scanner.nextInt());

			System.out.println("Enter the sign of the mathematical operation: ");
			calc.setMathOperation(scanner.next().charAt(0));

			System.out.println("Enter second number: ");
			calc.setSecondNumber(scanner.nextInt());

			int result = calc.calculate();
			System.out.println(calc.calculate());
        
			do {
        		System.out.println("Want to continue? [Yes/No]");
        		response = scanner.next().charAt(0);
        	} while (response != 'Y' && response != 'N');
    	} while (response == 'Y');
    }
}