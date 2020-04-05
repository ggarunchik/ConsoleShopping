package com.consoleshopping.intemcontroller;

import java.util.Date;

public abstract class AItem {
    private int pID;
    private String vendorName;
    private double priceRetail;
    private double priceSupplier;
    private Date dateAdded;

    public AItem(int pID, String vendorName, double priceRetail, double priceSupplier, Date dateAdded) {
        this.pID = pID;
        this.vendorName = vendorName;
        this.priceRetail = priceRetail;
        this.priceSupplier = priceSupplier;
        this.dateAdded = dateAdded;
    }

    public AItem() {
    }

    public AItem(int pID, String vendorName, double priceRetail, Date dateAdded) {
        this.pID = pID;
        this.vendorName = vendorName;
        this.priceRetail = priceRetail;
        this.dateAdded = dateAdded;
    }

    public AItem(String vendorName, double priceRetail, Date dateAdded) {
        this.vendorName = vendorName;
        this.priceRetail = priceRetail;
        this.dateAdded = dateAdded;
    }

    public int getpID() {
        return pID;
    }

    public void setpID(int pID) {
        this.pID = pID;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public double getPriceRetail() {
        return priceRetail;
    }

    public void setPriceRetail(double priceRetail) {
        this.priceRetail = priceRetail;
    }

    public double getPriceSupplier() {
        return priceSupplier;
    }

    public void setPriceSupplier(double priceSupplier) {
        this.priceSupplier = priceSupplier;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }
}
