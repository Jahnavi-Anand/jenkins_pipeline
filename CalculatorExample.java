// Define an interface with two methods
interface Calculator {
    double division(double num1, double num2);
    double modulus(double num1, double num2);
}

// Create a class that implements the Calculator interface
class BasicCalculator implements Calculator {
    @Override
    public double division(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN; // Return NaN for an undefined result
        }}

    @Override
    public double modulus(double num1, double num2) {
        if (num2 != 0) {
            return num1 % num2;
        } else {
            System.out.println("Modulus by zero is undefined.");
            return Double.NaN; // Return NaN for an undefined result
        }}}

public class CalculatorExample {
    public static void main(String[] args) {
        BasicCalculator calculator = new BasicCalculator();

        // Perform division and modulus operations
        double result1 = calculator.division(10.0, 2.0);
        double result2 = calculator.modulus(10.0, 3.0);

        System.out.println("Division Result: " + result1);
        System.out.println("Modulus Result: " + result2);
    }}