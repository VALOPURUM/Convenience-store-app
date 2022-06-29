package org.example;

import java.util.List;

public class Customer {
    private String customerName;
    private  List<Products> customerCart;



    public Customer(String customerName, List<Products> customerCart) {
        this.customerName = customerName;
        this.customerCart = customerCart;
    }
    //The customer buying method
    public int buy(List<Products> products, Products product , int qtyBuying ){

        product.setQtyBuying(qtyBuying);
        int output=0;

        for(Products prod : products) {
            if (prod.getBrand().equals(product.getBrand()) && prod.getQtyAvailable() >= qtyBuying) {
                customerCart.add(product);
                product.setQtyAvailable(product.getQtyAvailable()-qtyBuying);
                System.out.println("Product Added To Cart");
                output=0;

            } else if (prod.getBrand().equals(product.getBrand()) && product.getQtyAvailable() < qtyBuying) {
                System.out.println("We only have " + product.getQtyAvailable() + " in the store kindly re-order");
                 output= 1;


            }else if(!products.contains(product)){
                System.out.println("We do not have this product in the store, kindly change your order.");
                 output = 1;

            }
        }
        return  output;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<Products> getCustomerCart() {
        return customerCart;
    }
}


