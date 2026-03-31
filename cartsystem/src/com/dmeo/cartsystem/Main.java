package com.dmeo.cartsystem;

public class Main {
    public static void main(String[] args){
        Product p1=new Product("Dress",500.67);
        Product p2=new Product("Top",257.7);
        Product p3=new Product("Shapewear",450.97);
         Cart c=new Cart();

         c.addProduct(p1);
         c.addProduct(p2);
         c.addProduct(p3);

         c.removeproduct("Bag");
         c.removeproduct("top");

         c.displaycart();

         //System.out.println("Totalprice"+ " "+ String.format("%2f",c.totalprice()));
       // System.out.println("Totalprice"+ " "+Math.round(c.totalprice()));
        System.out.println("Totalprice"+ " "+ String.format("%2f",c.totalprice()));//for 2 decimal purpose
        System.out.println("Totalprice"+ " "+Math.round(c.totalprice()));//for round off value purpose
    }
}
