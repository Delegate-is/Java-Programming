public class ArithmeticOperations{
    public int addition(int a, int b) {
        return a + b;
    }
    public int subtraction(int num1, int num2){
        return num1 - num2;
    }
    public int multiplication(int num1, int num2){
        return num1 * num2;
    }
    public double division(double num1, double num2){
        if (num2 == 0){
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }
}