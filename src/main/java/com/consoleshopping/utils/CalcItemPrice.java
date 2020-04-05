package com.consoleshopping.utils;

import static com.consoleshopping.utils.ShopMargin.*;


public class CalcItemPrice {

     public static double calcBicycleRetailPrice(double supplierPrice){
          return supplierPrice * BICYCLE_MARGIN;
     }

    public static double calcLaptopRetailPrice(double supplierPrice){
        return supplierPrice * LAPTOP_MARGIN;
    }

}
