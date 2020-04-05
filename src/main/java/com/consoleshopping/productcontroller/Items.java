package com.consoleshopping.productcontroller;

import com.consoleshopping.intemcontroller.AItem;
import com.consoleshopping.intemcontroller.Bicycle;
import com.consoleshopping.intemcontroller.Laptop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.consoleshopping.utils.CalcItemPrice.*;

public class Items implements ItemsCreator {
    private final List<AItem> productList = new ArrayList<>();
    private final List<Bicycle> bicycleList = new ArrayList<>();
    private final List<Laptop> laptopList = new ArrayList<>();

    public Items() {
        initProductStore();
    }

    public List<Bicycle> getBicycleList() {
        return bicycleList;
    }

    public List<Laptop> getLaptopList() {
        return laptopList;
    }

    public List<AItem> getProductList() {
        return productList;
    }

    @Override
    public void initProductStore() {

        bicycleList.add(new Bicycle(1, "LTD", calcBicycleRetailPrice(125), new Date(), 2, 14, "XXL", "red"));
        bicycleList.add(new Bicycle(2, "AIST", calcBicycleRetailPrice(98), new Date(), 2, 14, "XL", "blue"));
        bicycleList.add(new Bicycle(3, "STELS", calcBicycleRetailPrice(111), new Date(), 2, 14, "L", "green"));
        bicycleList.add(new Bicycle(4, "CUBE", calcBicycleRetailPrice(252), new Date(), 2, 14, "XXL", "black"));

        laptopList.add(new Laptop(5, "APPLE", calcLaptopRetailPrice(890), new Date(), 4, 16, true));
        laptopList.add(new Laptop(6, "HP", calcLaptopRetailPrice(656), new Date(), 4, 32, false));
        laptopList.add(new Laptop(7, "ASUS", calcLaptopRetailPrice(346), new Date(), 8, 16, false));
        laptopList.add(new Laptop(8, "LENOVO", calcLaptopRetailPrice(286), new Date(), 2, 8, true));

        productList.addAll(bicycleList);
        productList.addAll(laptopList);
    }


    public void showProductList() {
        for (AItem aItem : productList) {
            if (aItem == null) {
                break;
            }
            System.out.println(aItem);
        }
    }

}
