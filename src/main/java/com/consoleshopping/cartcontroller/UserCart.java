package com.consoleshopping.cartcontroller;

import com.consoleshopping.intemcontroller.AItem;
import com.consoleshopping.productcontroller.Items;

import java.util.List;

public class UserCart extends ACart implements Cartable {


    @Override
    public void addItemToCardByID(int pID) {
        AItem item = getItemByProductID(pID);
        addToCart(item);
    }

    @Override
    public AItem getItemByProductID(int pID) {
        AItem item = null;
        List<AItem> allItems = new Items().getProductList();
        for (AItem items : allItems) {
            if (items.getpID() == pID) {
                item = items;
                break;
            }
        }
        return item;
    }

    @Override
    public void addToCart(AItem item) {
        cartItems.add(item);
    }

    @Override
    public void removeItemByID(int pID) {

        AItem item = getItemByProductID(pID);
        cartItems.remove(item);
    }

    @Override
    public void showCartItems() {
        for (AItem aItem : cartItems) {
            if (aItem == null) {
                break;
            }
            System.out.println(aItem);
        }
    }
}
