/**
 * Created by Nolan Barth on 2/19/16.
 */
public class App {

    public static void main(String[] args) {
        System.out.println(Calculator.add(1, 1));
        System.out.println(Calculator.add(2, 12));
        System.out.println(Calculator.subtract(50, 8));
        System.out.println(Calculator.subtract(8, 50));
        System.out.println(Calculator.multiply(20, 16));
        System.out.println(Calculator.multiply(30, 13));

        try{
            int n = Calculator.divide(20, 3);
            System.out.println(n);
        }catch(DivisionByZeroException e){
            System.out.println("Division by 0 not allowed.");
        }
        try{
            int n = Calculator.divide(300, 0);
            System.out.println(n);
        }catch(DivisionByZeroException e){
            System.out.println("Division by 0 not allowed.");
        }
    }
}
