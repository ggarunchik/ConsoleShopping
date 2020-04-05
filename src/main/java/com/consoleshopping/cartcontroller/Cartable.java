package com.consoleshopping.cartcontroller;

import com.consoleshopping.intemcontroller.AItem;

public interface Cartable {

    void addItemToCardByID(int pID);

    AItem getItemByProductID(int pid);

    void addToCart(AItem item);

    void removeItemByID(int pID);

    void showCartItems();
}
