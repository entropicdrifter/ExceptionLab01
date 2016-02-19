/**
 * Created by Nolan Barth on 2/19/16.
 */
public class Calculator {
    public static int add(int first, int second){
        return first+second;
    }
    public static int subtract(int first, int second){
        return first-second;
    }
    public static int multiply(int first, int second){
        return first*second;
    }
    public static int divide(int first, int second) throws DivisionByZeroException{
        if (second == 0) throw new DivisionByZeroException();
        else return first/second;
    }
    public static int squareRoot(int square) throws ComplexNumberException{
        if (square < 0) throw new ComplexNumberException();
        else return (int)Math.round(Math.sqrt(square));
    }
}
class DivisionByZeroException extends Exception{}
class ComplexNumberException extends Exception{}

