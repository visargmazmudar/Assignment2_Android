package com.example.macstudent.catalog;

import android.content.res.Resources;

import java.util.List;
import java.util.Vector;

/**
 * Created by macstudent on 2017-08-14.
 */

public class ShoppingCartHelper {

    public static final String PRODUCT_INDEX = "PRODUCT_INDEX";

    private static List<Product> catalog;
    private static List<Product> cart;

    public static List<Product> getCatalog(Resources res){
        if(catalog == null) {
            catalog = new Vector<Product>();
            catalog.add(new Product("Lipstick", res
                    .getDrawable(R.drawable.lipstick),
                    "This is a good and long lastic Lipstick", 10.99));
            catalog.add(new Product("Eyeliner", res
                    .getDrawable(R.drawable.eyeliner),
                    "This is a good and long lastic eyeliner", 20.99));
            catalog.add(new Product("Powder", res
                    .getDrawable(R.drawable.powder),
                    "This is a good and long lastic powder", 15.99));
            catalog.add(new Product("Powder", res
                    .getDrawable(R.drawable.powder2),
                    "This is a good and long lastic powder", 12.99));
            catalog.add(new Product("Lipstick", res
                    .getDrawable(R.drawable.lipstick1),
                    "This is a good and long lastic Lipstick", 14.99));
        }

        return catalog;
    }

    public static List<Product> getCart() {
        if(cart == null) {
            cart = new Vector<Product>();
        }

        return cart;
    }

}
