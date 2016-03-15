/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
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
public class LoadDataTest {
    
    public LoadDataTest() {
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
     * Test of loadDataFromFile method, of class LoadData.
     */
    @Test
    public void testLoadDataFromFile() {
        System.out.println("loadDataFromFile");
        String fileName = "dataset2.txt";
        List<ClassInfo> expResult = new ArrayList<ClassInfo>();
        expResult.add(new ClassInfo("Preface",7.0,1.0));
        expResult.add(new ClassInfo("Chapter 1",12.0,1.0));
        expResult.add(new ClassInfo("Chapter 2",10.0,1.0));
        expResult.add(new ClassInfo("Chapter 3",12.0,1.0));
        expResult.add(new ClassInfo("Chapter 4",10.0,1.0));
        expResult.add(new ClassInfo("Chapter 5",12.0,1.0));
        expResult.add(new ClassInfo("Chapter 6",12.0,1.0));
        expResult.add(new ClassInfo("Chapter 7",12.0,1.0));
        expResult.add(new ClassInfo("Chapter 8",12.0,1.0));
        expResult.add(new ClassInfo("Chapter 9",8.0,1.0));
        expResult.add(new ClassInfo("Appendix A",8.0,1.0));
        expResult.add(new ClassInfo("Appendix B",8.0,1.0));
        expResult.add(new ClassInfo("Appendix C",20.0,1.0));
        expResult.add(new ClassInfo("Appendix D",14.0,1.0));
        expResult.add(new ClassInfo("Appendix E",18.0,1.0));
        expResult.add(new ClassInfo("Appendix F",12.0,1.0));
        int equalValues = 0;
        List<ClassInfo> result = LoadData.loadDataFromFile(fileName);
        if(expResult.size() == result.size()) {
            for(int i = 0; i < expResult.size(); i++) {
                ClassInfo expElement = expResult.get(i);
                ClassInfo resultElement = result.get(i);
                if(expElement.getClassName().equals(resultElement.getClassName()) && (expElement.getLoc() == resultElement.getLoc()) && (expElement.getNumberOfMethods() == resultElement.getNumberOfMethods())) {
                    equalValues++;
                }
            }
        }else {
            fail("Las listas tienen diferentes longitudes");
        }
        assertEquals(equalValues, expResult.size());
    }
}
