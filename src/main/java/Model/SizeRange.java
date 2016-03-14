/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author SantiagoAvila
 */
public class SizeRange {
    
    private double verySmall;
    private double small;
    private double medium;
    private double large;
    private double veryLarge;
    private double average;
    private double variance;

    /**
     *VerySmall attribute getter
     * @return very small value
     */
    public double getVerySmall() {
        return verySmall;
    }

    /**
     *
     * @param verySmall
     */
    public void setVerySmall(double verySmall) {
        this.verySmall = verySmall;
    }

    /**
     *Small attribute getter
     * 
     * @return small value
     */
    public double getSmall() {
        return small;
    }

    /**
     *Small attribute setter
     * 
     * @param small
     */
    public void setSmall(double small) {
        this.small = small;
    }

    /**
     *Medium attribute getter
     * 
     * @return
     */
    public double getMedium() {
        return medium;
    }

    /**
     *Medium attribute setter
     * 
     * @param medium
     */
    public void setMedium(double medium) {
        this.medium = medium;
    }

    /**
     *Large attribute getter
     * 
     * @return
     */
    public double getLarge() {
        return large;
    }

    /**
     *Large attribute setter
     * 
     * @param large
     */
    public void setLarge(double large) {
        this.large = large;
    }

    /**
     *VeryLarge attribute getter
     * 
     * @return
     */
    public double getVeryLarge() {
        return veryLarge;
    }

    /**
     *VeryLarge attribute setter
     * 
     * @param veryLarge
     */
    public void setVeryLarge(double veryLarge) {
        this.veryLarge = veryLarge;
    }

    /**
     *Average attribute getter
     * 
     * @return
     */
    public double getAverage() {
        return average;
    }

    /**
     *Average attribute setter
     * 
     * @param average
     */
    public void setAverage(double average) {
        this.average = average;
    }

    /**
     *Variance attribute getter
     * 
     * @return
     */
    public double getVariance() {
        return variance;
    }

    /**
     *Variance attribute setter
     * 
     * @param variance
     */
    public void setVariance(double variance) {
        this.variance = variance;
    }
    
    /**
     *Calculates the standarDeviation using the value of the variance attribute
     * @return
     */
    public double getStandardDeviation() {
        return 0.0;
    }
}
