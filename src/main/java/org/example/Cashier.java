package org.example;

import java.util.List;

public class Cashier extends Staff {
    public Cashier(String name, int idNo) {

        super(name, idNo);
    }

    // The Cashier selling method
    public int sell(Customer customer, List<Products> customerCart) {
        if(customerCart.size()==0){
            System.out.println("The customer's cart is empty");
            return 1;
        }else{
            double totalCost = 0;
            for (Products prod : customerCart) {
                totalCost += (prod.getPrice() * prod.getQtyBuying());
            }
            System.out.println(customer.getCustomerName() + ", " +
                    "here's your receipt for product(s) bought\n");

            System.out.print("################################# \n" +
                    "Thank You For your Patronage, " + customer.getCustomerName() + "! \n" +
                    "RECIEPT OF PURCHASES  \n" +
                    "################################# \n" +
                    "################################# \n" +
                    "PRODUCTS:\n");
            for (Products prod : customerCart) {
                System.out.println(prod.getBrand() + ", Qty: " + prod.getQtyBuying() + " " + "Price " + prod.getPrice());
            }
            System.out.println("TotalCost: " + totalCost);
            return 0;
        }

    }





}





