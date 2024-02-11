public class Calculator {
    private int number1;
    private int number2;

    
    public Calculator(int num1, int num2) {
        this.number1 = num1;
        this.number2 = num2;
    }

    
    int dodajBroj() {
        return number1 + number2;
    }
}