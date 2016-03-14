/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CalculationManager;
import Model.ClassInfo;
import Model.LoadData;
import Model.SizeRange;
import java.util.List;

/**
 *
 * @author SantiagoAvila
 */
public class Controller {
    
    public List<ClassInfo> loadClassInfo(String fileName) {
        return LoadData.loadDataFromFile(fileName);
    }
    
    public SizeRange calculateSizeRange(List<ClassInfo> classInfoList) {
        SizeRange sizeRange = new SizeRange();
        sizeRange.setAverage(CalculationManager.average(classInfoList));
        sizeRange.setVariance(CalculationManager.variance(classInfoList));
        return sizeRange;
    }
}
