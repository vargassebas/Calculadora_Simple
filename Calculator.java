
public class Calculator {
    // variables
    int input1, input2, calc;
    int result;

    // constructor
    public Calculator(int num1, int num2, int calc) {
        this.input1 = num1;
        this.input2 = num2;
        this.calc = calc;
    }

    // methods
    public int add(int num1, int num2) {
        result = num1 + num2;
        return result;
    }

    public int subtract(int num1, int num2) {
        result = num1 - num2;
        return result;
    }

    public int multiply(int num1, int num2) {
        result = num1 * num2;
        return result;
    }

    public int divide(int num1, int num2) {
        result = num1 / num2;
        return result;
    }

    public int modulo(int num1, int num2) {
        result = num1 % num2;
        return result;
    }
}