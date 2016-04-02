package by.mycompany.fistprojectwithtest;

public class Calculate {

    public int sum(int first, int second) {
        return first + second;
    }
    
    public int diff(int first, int second) {
        return first - second;
    }
    
    public int multiply(int first, int second) {
        return first * second;
    }
    
    public double division(int first, int second) {
        if (second != 0) {
            return first / second;
        }
        throw new IllegalArgumentException("Division by zero");
    }
}