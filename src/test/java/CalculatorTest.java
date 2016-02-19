import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nolan Barth on 2/19/16.
 */
public class CalculatorTest {
    @Test
    public void addTest(){
        assertEquals(3, Calculator.add(1, 2));
        assertEquals(50, Calculator.add(27, 23));
        assertEquals(13, Calculator.add(2, 11));
    }
    @Test
    public void subtractTest(){
        assertEquals(14, Calculator.subtract(83, 69));
        assertEquals(-33, Calculator.subtract(100, 133));
        assertEquals(50, Calculator.subtract(5150, 5100));
    }
    @Test
    public void multiplyTest(){
        assertEquals(9, Calculator.multiply(3,3));
        assertEquals(52, Calculator.multiply(26, 2));
        assertEquals(144, Calculator.multiply(12,12));
    }
    @Test
    public void divideTest(){
        int x;
        try{
            x = Calculator.divide(144, 12);
        }catch (Exception e) {
            x=0;
        }
        assertEquals(12, x);
        try{
            x= Calculator.divide(120, 0);
        } catch (DivisionByZeroException e) {
            x=-1;
        }
        assertEquals("The Exception should be thrown and x should be set to -1",-1, x);
    }
    @Test
    public void squareRootTest(){
        int sq;
        try {
            sq=Calculator.squareRoot(64);
        }catch(ComplexNumberException e){
            sq = 0;
        }
        assertEquals(8, sq);

        try{
            sq = Calculator.squareRoot(-64);
        }catch(ComplexNumberException e){
            sq = -1;
        }
        assertEquals("sq should return as -1 because of a caught exception",-1, sq);

    }
}
