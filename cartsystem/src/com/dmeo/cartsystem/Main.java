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
         //System.out.println("Totalprice"+ " "+ String.format("%2f",c.totalprice()));
        System.out.println("Totalprice"+ " "+Math.round(c.totalprice()));
    }
}
