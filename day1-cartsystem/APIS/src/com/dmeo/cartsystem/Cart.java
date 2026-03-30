package com.dmeo.cartsystem;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products= new ArrayList<>();

    public void addProduct(Product item)
    {
        products.add(item);
        //System.out.println(item.getName() +"added to cart");
    }

    public double totalprice(){
        double total=0;
        for(Product p:products)
        {
            total+=p.getPrice();
        }
        return total;
    }

}
