package com.consoleshopping.intemcontroller;

import java.util.Date;
import java.util.Objects;

public class Laptop extends AItem {
    private int amountCPU;
    private int amountRAM;
    private boolean isUltraBook;

    public Laptop(int pID, String productName, double priceRetail, double priceSupplier, Date dateAdded, int amountCPU, int amountRAM, boolean isUltraBook) {
        super(pID, productName, priceRetail, priceSupplier, dateAdded);
        this.amountCPU = amountCPU;
        this.amountRAM = amountRAM;
        this.isUltraBook = isUltraBook;
    }

    public Laptop(int pID, String productName, double priceRetail, Date dateAdded, int amountCPU, int amountRAM, boolean isUltraBook) {
        super(pID, productName, priceRetail, dateAdded);
        this.amountCPU = amountCPU;
        this.amountRAM = amountRAM;
        this.isUltraBook = isUltraBook;
    }

    public Laptop(String vendorName, double priceRetail, Date dateAdded, int amountCPU, int amountRAM, boolean isUltraBook) {
        super(vendorName, priceRetail, dateAdded);
        this.amountCPU = amountCPU;
        this.amountRAM = amountRAM;
        this.isUltraBook = isUltraBook;
    }

    public int getAmountCPU() {
        return amountCPU;
    }

    public void setAmountCPU(int amountCPU) {
        this.amountCPU = amountCPU;
    }

    public int getAmountRAM() {
        return amountRAM;
    }

    public void setAmountRAM(int amountRAM) {
        this.amountRAM = amountRAM;
    }

    public boolean getIsUltraBook() {
        return isUltraBook;
    }

    public void setIsUltraBook(boolean isUltraBook) {
        this.isUltraBook = isUltraBook;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "pID=" + getpID() +
                ", vendorName='" + getVendorName() + '\'' +
                ", priceRetail=" + getPriceRetail() +
                ", amountCPU=" + amountCPU +
                ", amountRAM=" + amountRAM +
                ", isUltraBook='" + isUltraBook + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return amountCPU == laptop.amountCPU &&
                amountRAM == laptop.amountRAM &&
                isUltraBook == laptop.isUltraBook;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountCPU, amountRAM, isUltraBook);
    }
}
