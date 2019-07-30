class Calculator {

    private int firstNumber;
    private char mathOperation;
    private int secondNumber;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public char getMathOperation() {
        return mathOperation;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int calculate() {
        switch (mathOperation) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            case '/':
                return firstNumber / secondNumber;
            case '%':
                return firstNumber % secondNumber;
            case '^':
        int fractionalResult = 1;
        for (int i = 1; i <= secondNumber ; i++) {
            fractionalResult *= firstNumber;
        }
            return fractionalResult;
            default:
                System.out.println("Invalid operation entered: try again");
        return 0;
        }
    }
}