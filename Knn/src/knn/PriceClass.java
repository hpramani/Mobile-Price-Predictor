/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn;

/**
 *
 * @author hpram
 */
public class PriceClass {

    private char className;
    private int priceMin, priceMax;

    public PriceClass(char className, int priceMin, int priceMax) {
        this.className = className;
        this.priceMin = priceMin;
        this.priceMax = priceMax;
    }

    public char getClassName() {
        return className;
    }

    public void setClassName(char className) {
        this.className = className;
    }

    public int getPriceMin() {
        return priceMin;
    }

    public void setPriceMin(int priceMin) {
        this.priceMin = priceMin;
    }

    public int getPriceMax() {
        return priceMax;
    }

    public void setPriceMax(int priceMax) {
        this.priceMax = priceMax;
    }
    
    @Override
    public String toString() {
        return "PriceClass{" + "className=" + className + ", priceMin=" + priceMin + ", priceMax=" + priceMax + '}';
    }

}
