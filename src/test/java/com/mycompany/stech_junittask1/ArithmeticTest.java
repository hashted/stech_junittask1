package com.mycompany.stech_junittask1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Администратор
 */
public class ArithmeticTest {
    
    private Arithmetic instance;
     
    public ArithmeticTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Arithmetic();
    }
    
    @After
    public void tearDown() {
    }

//    @Test
//    public void testAddingFunction() {
//        System.out.println("AddingFunction");
//        int a = 0;
//        int b = 0;
//        int expResult = 0;
//        int result = instance.AddingFunction(a, b);
//        assertEquals(expResult, result);
//    }
    
}
