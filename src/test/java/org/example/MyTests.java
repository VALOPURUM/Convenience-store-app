package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyTests {


            //Products added to the store
            Products milk =new Products("peak milk",100.0, 50);
            Products biscuit = new Products("Cabin biscuit",50.0, 40);
            Products bread = new Products("Agege bread", 200.0, 20);
            Products sugar = new Products("Louis sugar", 100.0, 15);

            List<Products> productsList1 = new ArrayList<Products>();

            //the customer's cart
            List<Products> JohnCart = new ArrayList<>();
            List<Products> DavidCart = new ArrayList<>();


            //The customer
            Customer customer1 = new Customer("John", JohnCart);
            Customer customer2 = new Customer("David", DavidCart);

            //Things bought by the customer


            //The cashier sells
            Cashier cashier = new Cashier("Ada",2345);

            Manager manager = new Manager("David" ,2345);
            Applicant applicant1 = new Applicant("Peter", 25, "Male", true,80);
            Applicant applicant2 = new Applicant("Peter", 25, "Male", true,40);
            List<Staff> staffList = new ArrayList<>();





    public void  main(String[] args){
        List<Products> productsList1 = new ArrayList<Products>();
        productsList1.add(milk);
        productsList1.add(biscuit);
        productsList1.add(bread);
        productsList1.add(sugar);

        customer1.buy(productsList1 , sugar , 2);
        customer1.buy(productsList1, biscuit, 2);
        customer1.buy(productsList1, sugar, 2);




        }

    @Test
    void buy(){
        int actual1 = customer1.buy(productsList1,milk,5);
        assertEquals(0, actual1);


    }
    @Test
    void sell() {
        int actual1 = cashier.sell(customer1, JohnCart);
        assertEquals(0,actual1);


    }

    @Test
    void hireCashier(){

            int actual1 = manager.hireCashier(staffList,applicant1);
            assertEquals(0,actual1);

            int actual2 = manager.hireCashier(staffList,applicant2);
            assertEquals(1,actual2);


        }

}