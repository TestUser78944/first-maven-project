package by.mycompany.fistprojectwithtest;

import static org.junit.Assert.*;

public class CalculateTest {

    /**
     * Test of sum method, of class Calculate.
     */
    @org.junit.Test
    public void testSum() {
        System.out.println("sum");
        int first = 42;
        int second = -42;
        int expResult = 0;
        
        Calculate instance = new Calculate();
        int result = instance.sum(first, second);
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    /**
     * Test of diff method, of class Calculate.
     */
    @org.junit.Test
    public void testDiff() {
        System.out.println("diff");
        int first = 42;
        int second = 12;
        int expResult = 30;
        Calculate instance = new Calculate();
        int result = instance.diff(first, second);
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class Calculate.
     */
    @org.junit.Test
    public void testMultiply() {
        System.out.println("multiply");
        int first = 6;
        int second = 8;
        int expResult = 48;
        Calculate instance = new Calculate();
        int result = instance.multiply(first, second);
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class Calculate.
     */
    @org.junit.Test
    public void testDivision() {
        System.out.println("division");
        double delta = 0.00001D;
        int first = 48;
        int second = 12;
        double expResult = 4.0D;
        Calculate instance = new Calculate();
        double result = instance.division(first, second);
        assertEquals(expResult, result, delta);
//        fail("The test case is a prototype.");
    }
    
    /**
     * Test of division method, of class Calculate.
     * Checked divide by zero.
     */
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        System.out.println("division by zero");
        int first = 42;
        int second = 0;
        Calculate instance = new Calculate();
        instance.division(first, second);
//        fail("The test case is a prototype.");
    }
}