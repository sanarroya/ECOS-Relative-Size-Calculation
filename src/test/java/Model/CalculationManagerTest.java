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
public class CalculationManagerTest {
    
    public CalculationManagerTest() {
    }
   
    /**
     * Test of average method, of class CalculationManager.
     */
    @Test
    public void testAverage() {
        System.out.println("average");
        List<ClassInfo> classInfoList = new ArrayList<ClassInfo>();
        classInfoList.add(new ClassInfo("Preface",7.0,1.0));
        classInfoList.add(new ClassInfo("Chapter 1",12.0,1.0));
        classInfoList.add(new ClassInfo("Chapter 2",10.0,1.0));
        classInfoList.add(new ClassInfo("Chapter 3",12.0,1.0));
        classInfoList.add(new ClassInfo("Chapter 4",10.0,1.0));
        classInfoList.add(new ClassInfo("Chapter 5",12.0,1.0));
        classInfoList.add(new ClassInfo("Chapter 6",12.0,1.0));
        classInfoList.add(new ClassInfo("Chapter 7",12.0,1.0));
        classInfoList.add(new ClassInfo("Chapter 8",12.0,1.0));
        classInfoList.add(new ClassInfo("Chapter 9",8.0,1.0));
        classInfoList.add(new ClassInfo("Appendix A",8.0,1.0));
        classInfoList.add(new ClassInfo("Appendix B",8.0,1.0));
        classInfoList.add(new ClassInfo("Appendix C",20.0,1.0));
        classInfoList.add(new ClassInfo("Appendix D",14.0,1.0));
        classInfoList.add(new ClassInfo("Appendix E",18.0,1.0));
        classInfoList.add(new ClassInfo("Appendix F",12.0,1.0));
        double expResult = 2.4193;
        double result = CalculationManager.average(classInfoList);
        assertEquals(expResult, result, 1.0);
    }

    /**
     * Test of variance method, of class CalculationManager.
     */
    @Test
    public void testVariance() {
        System.out.println("variance");
        List<ClassInfo> classInfoList = new ArrayList<ClassInfo>();
        classInfoList.add(new ClassInfo("Preface",7.0,1.0));
        classInfoList.add(new ClassInfo("Chapter 1",12.0,1.0));
        classInfoList.add(new ClassInfo("Chapter 2",10.0,1.0));
        classInfoList.add(new ClassInfo("Chapter 3",12.0,1.0));
        classInfoList.add(new ClassInfo("Chapter 4",10.0,1.0));
        classInfoList.add(new ClassInfo("Chapter 5",12.0,1.0));
        classInfoList.add(new ClassInfo("Chapter 6",12.0,1.0));
        classInfoList.add(new ClassInfo("Chapter 7",12.0,1.0));
        classInfoList.add(new ClassInfo("Chapter 8",12.0,1.0));
        classInfoList.add(new ClassInfo("Chapter 9",8.0,1.0));
        classInfoList.add(new ClassInfo("Appendix A",8.0,1.0));
        classInfoList.add(new ClassInfo("Appendix B",8.0,1.0));
        classInfoList.add(new ClassInfo("Appendix C",20.0,1.0));
        classInfoList.add(new ClassInfo("Appendix D",14.0,1.0));
        classInfoList.add(new ClassInfo("Appendix E",18.0,1.0));
        classInfoList.add(new ClassInfo("Appendix F",12.0,1.0));
        double expResult = 0.0820;
        double result = CalculationManager.variance(classInfoList);
        assertEquals(expResult, result, 1.0);
    }    
}