package com.consoleshopping.intemcontroller;

import java.util.Date;
import java.util.Objects;

public class Bicycle extends AItem {

    private int wheelsAmount;
    private int gearsAmount;
    private String frameSize;
    private String bicycleColour;

    public Bicycle(int pID, String vendorName, double priceRetail, double priceSupplier, Date dateAdded, int wheelsAmount, int gearsAmount, String frameSize, String bicycleColour) {
        super(pID, vendorName, priceRetail, priceSupplier, dateAdded);
        this.wheelsAmount = wheelsAmount;
        this.gearsAmount = gearsAmount;
        this.frameSize = frameSize;
        this.bicycleColour = bicycleColour;
    }

    public Bicycle(int pID, String vendorName, double priceRetail, Date dateAdded, int wheelsAmount, int gearsAmount, String frameSize, String bicycleColour) {
        super(pID, vendorName, priceRetail, dateAdded);
        this.wheelsAmount = wheelsAmount;
        this.gearsAmount = gearsAmount;
        this.frameSize = frameSize;
        this.bicycleColour = bicycleColour;
    }

    public Bicycle(String vendorName, double priceRetail, Date dateAdded, int wheelsAmount, int gearsAmount, String frameSize, String bicycleColour) {
        super(vendorName, priceRetail, dateAdded);
        this.wheelsAmount = wheelsAmount;
        this.gearsAmount = gearsAmount;
        this.frameSize = frameSize;
        this.bicycleColour = bicycleColour;
    }

    public int getWheelsAmount() {
        return wheelsAmount;
    }

    public void setWheelsAmount(int wheelsAmount) {
        this.wheelsAmount = wheelsAmount;
    }

    public int getGearsAmount() {
        return gearsAmount;
    }

    public void setGearsAmount(int gearsAmount) {
        this.gearsAmount = gearsAmount;
    }

    public String getFrameSize() {
        return frameSize;
    }

    public void setFrameSize(String frameSize) {
        this.frameSize = frameSize;
    }

    public String getBicycleColour() {
        return bicycleColour;
    }

    public void setBicycleColour(String bicycleColour) {
        this.bicycleColour = bicycleColour;
    }


    @Override
    public String toString() {
        return "Bicycle{" +
                "pID=" + getpID() +
                ", vendorName='" + getVendorName() + '\'' +
                ", priceRetail=" + getPriceRetail() +
                ", wheelsAmount=" + wheelsAmount +
                ", gearsAmount=" + gearsAmount +
                ", frameSize='" + frameSize + '\'' +
                ", bicycleColour='" + bicycleColour + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bicycle bicycle = (Bicycle) o;
        return wheelsAmount == bicycle.wheelsAmount &&
                gearsAmount == bicycle.gearsAmount &&
                Objects.equals(frameSize, bicycle.frameSize) &&
                Objects.equals(bicycleColour, bicycle.bicycleColour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheelsAmount, gearsAmount, frameSize, bicycleColour);
    }
}
