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
public class MobileData {

    private PriceClass priceClass;
    private String brand, model;
    private float os, frontCameraPixel, rearCameraPixel, rearTelephoto, rearUltraAngle, frontUltraAngle;
    private int ram, passMarkMemory, batterySize, maxCharging, storage,
            passMarkDisk, resolutionDensity, processNode, passMark2d, passMark3d,
            geekBenchSinglecore, geekBenchMulticore, price;

    public MobileData(String brand, String model, float os, int ram,
            int passMarkMemory, int batterySize, int maxCharging, int storage,
            int passMarkDisk, int resolutionDensity, int processNode, int passMark2d, int passMark3d,
            int geekBenchSinglecore, int geekBenchMulticore, int price, PriceClass priceClass,
            float frontCameraPixel, float rearCameraPixel, float rearTelephoto, float rearUltraAngle, float frontUltraAngle) {
        this.priceClass = priceClass;
        this.brand = brand;
        this.model = model;
        this.os = os;
        this.frontCameraPixel = frontCameraPixel;
        this.rearCameraPixel = rearCameraPixel;
        this.rearTelephoto = rearTelephoto;
        this.rearUltraAngle = rearUltraAngle;
        this.frontUltraAngle = frontUltraAngle;
        this.ram = ram;
        this.passMarkMemory = passMarkMemory;
        this.batterySize = batterySize;
        this.maxCharging = maxCharging;
        this.storage = storage;
        this.passMarkDisk = passMarkDisk;
        this.resolutionDensity = resolutionDensity;
        this.processNode = processNode;
        this.passMark2d = passMark2d;
        this.passMark3d = passMark3d;
        this.geekBenchSinglecore = geekBenchSinglecore;
        this.geekBenchMulticore = geekBenchMulticore;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String Brand) {
        this.brand = Brand;
    }

    public PriceClass getPriceClass() {
        return priceClass;
    }

    public void setPriceClass(PriceClass priceClass) {
        this.priceClass = priceClass;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String Model) {
        this.model = Model;
    }

    public float getOs() {
        return os;
    }

    public void setOs(float Os) {
        this.os = Os;
    }

    public float getFrontCameraPixel() {
        return frontCameraPixel;
    }

    public void setFrontCameraPixel(float frontCameraPixel) {
        this.frontCameraPixel = frontCameraPixel;
    }

    public float getRearCameraPixel() {
        return rearCameraPixel;
    }

    public void setRearCameraPixel(float rearCameraPixel) {
        this.rearCameraPixel = rearCameraPixel;
    }

    public float getRearTelephoto() {
        return rearTelephoto;
    }

    public void setRearTelephoto(float rearTelephoto) {
        this.rearTelephoto = rearTelephoto;
    }

    public float getRearUltraAngle() {
        return rearUltraAngle;
    }

    public void setRearUltraAngle(float rearUltraAngle) {
        this.rearUltraAngle = rearUltraAngle;
    }

    public float getFrontUltraAngle() {
        return frontUltraAngle;
    }

    public void setFrontUltraAngle(float frontUltraAngle) {
        this.frontUltraAngle = frontUltraAngle;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int Ram) {
        this.ram = Ram;
    }

    public int getPassMarkMemory() {
        return passMarkMemory;
    }

    public void setPassMarkMemory(int passMarkMemory) {
        this.passMarkMemory = passMarkMemory;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public int getMaxCharging() {
        return maxCharging;
    }

    public void setMaxCharging(int maxCharging) {
        this.maxCharging = maxCharging;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getPassMarkDisk() {
        return passMarkDisk;
    }

    public void setPassMarkDisk(int passMarkDisk) {
        this.passMarkDisk = passMarkDisk;
    }

    public int getResolutionDensity() {
        return resolutionDensity;
    }

    public void setResolutionDensity(int Resolution) {
        this.resolutionDensity = Resolution;
    }

    public int getProcessNode() {
        return processNode;
    }

    public void setProcessNode(int Processor) {
        this.processNode = Processor;
    }

    public int getPassMark2d() {
        return passMark2d;
    }

    public void setPassMark2d(int passMark2d) {
        this.passMark2d = passMark2d;
    }

    public int getPassMark3d() {
        return passMark3d;
    }

    public void setPassMark3d(int passMark3d) {
        this.passMark3d = passMark3d;
    }

    public int getGeekBenchSinglecore() {
        return geekBenchSinglecore;
    }

    public void setGeekBenchSinglecore(int geekBenchSinglecore) {
        this.geekBenchSinglecore = geekBenchSinglecore;
    }

    public int getGeekBenchMulticore() {
        return geekBenchMulticore;
    }

    public void setGeekBenchMulticore(int geekBenchMulticore) {
        this.geekBenchMulticore = geekBenchMulticore;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int Price) {
        this.price = Price;
    }
    
    public double getDistance (MobileData tarMobileData){
        double res;
        res = ((tarMobileData.getBatterySize()-this.getBatterySize()) * (tarMobileData.getBatterySize()-this.getBatterySize())
                + (tarMobileData.getFrontCameraPixel() - this.getFrontCameraPixel()) * (tarMobileData.getFrontCameraPixel() - this.getFrontCameraPixel())
                + (tarMobileData.getFrontUltraAngle() - this.getFrontUltraAngle()) * (tarMobileData.getFrontUltraAngle() - this.getFrontUltraAngle())
                + (tarMobileData.getGeekBenchMulticore() - this.getGeekBenchMulticore()) * (tarMobileData.getGeekBenchMulticore() - this.getGeekBenchMulticore())
                + (tarMobileData.getGeekBenchSinglecore() - this.getGeekBenchSinglecore()) * (tarMobileData.getGeekBenchSinglecore() - this.getGeekBenchSinglecore())
                + (tarMobileData.getMaxCharging() - this.getMaxCharging()) * (tarMobileData.getMaxCharging() - this.getMaxCharging())
                + (tarMobileData.getOs() - this.getOs()) * (tarMobileData.getOs() - this.getOs())
                + (tarMobileData.getPassMark2d() - this.getPassMark2d()) * (tarMobileData.getPassMark2d() - this.getPassMark2d())
                + (tarMobileData.getPassMark3d() - this.getPassMark3d()) * (tarMobileData.getPassMark3d() - this.getPassMark3d())
                + (tarMobileData.getPassMarkDisk() - this.getPassMarkDisk()) * (tarMobileData.getPassMarkDisk() - this.getPassMarkDisk())
                + (tarMobileData.getPassMarkMemory() - this.getPassMarkMemory()) * (tarMobileData.getPassMarkMemory() - this.getPassMarkMemory())
                + (tarMobileData.getProcessNode() - this.getProcessNode()) * (tarMobileData.getProcessNode() - this.getProcessNode())
                + (tarMobileData.getRam() - this.getRam()) * (tarMobileData.getRam() - this.getRam())
                + (tarMobileData.getRearCameraPixel() - this.getRearCameraPixel()) * (tarMobileData.getRearCameraPixel() - this.getRearCameraPixel())
                + (tarMobileData.getRearTelephoto() - this.getRearTelephoto()) * (tarMobileData.getRearTelephoto() - this.getRearTelephoto())
                + (tarMobileData.getRearUltraAngle() - this.getRearUltraAngle()) * (tarMobileData.getRearUltraAngle() - this.getRearUltraAngle())
                + (tarMobileData.getResolutionDensity() - this.getResolutionDensity()) * (tarMobileData.getResolutionDensity() - this.getResolutionDensity())
                + (tarMobileData.getStorage() - this.getStorage()) * (tarMobileData.getStorage() - this.getStorage())
                );
        res = Math.sqrt(res);
        return res;
    }

    @Override
    public String toString() {
        return "MobileData{" + "brand=" + brand + ", model=" + model + ", ram=" + ram + "GB, storage=" + storage + "GB}";
    }
}
