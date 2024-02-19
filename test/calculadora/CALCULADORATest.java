/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alumno Tarde
 */
public class CALCULADORATest {
    
    public CALCULADORATest() {
    }

    @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = CALCULADORA.sumar(a, b);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRestar() {
        System.out.println("restar");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = CALCULADORA.restar(a, b);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
