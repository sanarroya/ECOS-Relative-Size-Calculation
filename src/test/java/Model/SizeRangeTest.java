/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
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
public class SizeRangeTest {
    
    public SizeRangeTest() {
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
     * Test of getVerySmall method, of class SizeRange.
     */
    @Test
    public void testGetVerySmall() {
        System.out.println("getVerySmall");
        SizeRange instance = new SizeRange();
        instance.setVariance(0.0820);
        instance.setAverage(2.4193);
        double expResult = 6.3375;
        double result = instance.getVerySmall();
        assertEquals(expResult, result, 1.0);
    }

    /**
     * Test of getSmall method, of class SizeRange.
     */
    @Test
    public void testGetSmall() {
        System.out.println("getSmall");
        SizeRange instance = new SizeRange();
        instance.setVariance(0.0820);
        instance.setAverage(2.4193);
        double expResult = 8.4393;
        double result = instance.getSmall();
        assertEquals(expResult, result, 1.0);
    }

    /**
     * Test of getMedium method, of class SizeRange.
     */
    @Test
    public void testGetMedium() {
        System.out.println("getMedium");
        SizeRange instance = new SizeRange();
        instance.setVariance(0.0820);
        instance.setAverage(2.4193);
        double expResult = 11.2381;
        double result = instance.getMedium();
        assertEquals(expResult, result, 1.0);
    }

    /**
     * Test of getLarge method, of class SizeRange.
     */
    @Test
    public void testGetLarge() {
        System.out.println("getLarge");
        SizeRange instance = new SizeRange();
        instance.setVariance(0.0820);
        instance.setAverage(2.4193);
        double expResult = 14.9650;
        double result = instance.getLarge();
        assertEquals(expResult, result, 1.0);   
    }

    /**
     * Test of getVeryLarge method, of class SizeRange.
     */
    @Test
    public void testGetVeryLarge() {
        System.out.println("getVeryLarge");
        SizeRange instance = new SizeRange();
        instance.setVariance(0.0820);
        instance.setAverage(2.4193);
        double expResult = 19.9280;
        double result = instance.getVeryLarge();
        assertEquals(expResult, result, 1.0);
    }

    /**
     * Test of getAverage method, of class SizeRange.
     */
    @Test
    public void testGetAverage() {
        System.out.println("getAverage");
        String fileName = "dataset2.txt";
        List<ClassInfo> list = LoadData.loadDataFromFile(fileName);
        SizeRange instance = new SizeRange();
        instance.setAverage(CalculationManager.average(list));
        double expResult = 2.4193;
        double result = instance.getAverage();
        assertEquals(expResult, result, 1.0);
    }

    /**
     * Test of getVariance method, of class SizeRange.
     */
    @Test
    public void testGetVariance() {
        System.out.println("getVariance");
        String fileName = "dataset2.txt";
        List<ClassInfo> list = LoadData.loadDataFromFile(fileName);
        SizeRange instance = new SizeRange();
        instance.setVariance(CalculationManager.variance(list));
        double expResult = 0.0820;
        double result = instance.getVariance();
        assertEquals(expResult, result, 1.0);
    }

    /**
     * Test of getStandardDeviation method, of class SizeRange.
     */
    @Test
    public void testGetStandardDeviation() {
        System.out.println("getStandardDeviation");
        String fileName = "dataset2.txt";
        List<ClassInfo> list = LoadData.loadDataFromFile(fileName);
        SizeRange instance = new SizeRange();
        instance.setVariance(CalculationManager.variance(list));
        double expResult = 0.0;
        double result = instance.getStandardDeviation();
        assertEquals(expResult, result, 1.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}