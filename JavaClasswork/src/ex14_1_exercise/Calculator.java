package ex14_1_exercise;

/**
 *
 * @author Manex
 */
class NewException extends Exception {

    public String getMessage() {
        return "new message";
    }
}

public class Calculator {

    public int add(int x, int y) {
        return x + y;
    }

    // This method could throw an ArithmeticException
    public double divide(int x, int y) throws ArithmeticException {
        return x / y;

    }

    public void display() throws Exception {
        System.out.println("In display");
        throw new Exception("Throwing new exception");
    }

}
