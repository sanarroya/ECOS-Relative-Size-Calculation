/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SantiagoAvila
 */
public class ClassInfoTest {
    
    public ClassInfoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getLoc method, of class ClassInfo.
     */
    @Test
    public void testGetLoc() {
        System.out.println("getLoc");
        ClassInfo instance = new ClassInfo();
        instance.setLoc(18.0);
        double expResult = 18.0;
        double result = instance.getLoc();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getNumberOfMethods method, of class ClassInfo.
     */
    @Test
    public void testGetNumberOfMethods() {
        System.out.println("getNumberOfMethods");
        ClassInfo instance = new ClassInfo();
        instance.setNumberOfMethods(3.0);
        double expResult = 3.0;
        double result = instance.getNumberOfMethods();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of naturalLogarithmOfLocPerMethod method, of class ClassInfo.
     */
    @Test
    public void testNaturalLogarithmOfLocPerMethod() {
        System.out.println("naturalLogarithmOfLocPerMethod");
        ClassInfo instance = new ClassInfo();
        instance.setLoc(18.0);
        instance.setNumberOfMethods(3.0);
        double expResult = 1.7918;
        double result = instance.naturalLogarithmOfLocPerMethod();
        assertEquals(expResult, result, 1.0);
    }
    
}
