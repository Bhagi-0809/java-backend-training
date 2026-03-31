package com.dmeo.cartsystem;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products= new ArrayList<>();

    public void addProduct(Product item)
    {
        products.add(item);
        System.out.println(item.getName() +"added to cart");
    }

    public double totalprice(){
        double total=0;
        for(Product p:products)
        {
            total+=p.getPrice();

            // System.out.println(p.getName()+" "+p.getPrice());
        }
        return total;
    }

    public void removeproduct(String Productname){
        Product toremove=null;
        for(Product p:products){
            if(p.getName().equalsIgnoreCase(Productname)){
                toremove=p;
                break;
            }

        }
        if(toremove!=null){
            products.remove(toremove);
            System.out.println(Productname+"product removed from cart");
        }
        else{
            System.out.println("product not found");

        }

    }

}
