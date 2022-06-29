package org.example;


import java.util.List;

public class Products {
    //properties
    private String brand;
    private double price;

    private int qtyAvailable;
    private int qtyBuying;
    private List<Products> productsList;

    public List<Products> getProductsList() {
        return productsList;
    }


    public Products(String brand, double price,int qtyAvailable) {
        this(brand,price,0,qtyAvailable);
    }

    public Products(String brand, double price, int qtyBuying, int qtyAvailable) {
        this.brand = brand;
        this.price = price;
        this.qtyBuying = qtyBuying;
        this.qtyAvailable = qtyAvailable;

    }

    public String getBrand() {

        return brand;
    }



    public double getPrice() {

        return price;
    }

    public int getQtyAvailable() {

        return qtyAvailable;
    }

    public int getQtyBuying() {

        return qtyBuying;
    }

    public void setQtyBuying(int qtyBuying) {

        this.qtyBuying = qtyBuying;
    }

    public void setQtyAvailable(int qtyAvailable) {

        this.qtyAvailable = qtyAvailable;
    }

}
