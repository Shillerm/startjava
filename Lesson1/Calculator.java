public class Calculator {

    public static void main(String[] args) {
        int firstNumber = 5;  
        int secondNumber = 15;
        char mathOperation = '^';
        
        if(mathOperation == '/') {
            System.out.println(firstNumber / secondNumber);
        } else if (mathOperation == '*') {
            System.out.println(firstNumber * secondNumber);
        } else if (mathOperation == '+') {
            System.out.println(firstNumber + secondNumber);
        } else if (mathOperation == '-') {
            System.out.println(firstNumber - secondNumber);
        } else if (mathOperation == '%') {
            System.out.println(firstNumber % secondNumber);
        } else if (mathOperation == '^') {
            int fractionalResult = 1;
            for (int i = 1; i <= secondNumber ; i++) {
                fractionalResult *= firstNumber;
            }
            System.out.println(fractionalResult);
        }
    }
}