package org.example;

import java.util.ArrayList;
import java.util.List;


public class Main
{
    public static void main( String[] args )
    {
                //Products added to the store
                Products milk =new Products("peak milk",100.0, 50);
                Products biscuit = new Products("Cabin biscuit",50.0, 40);
                Products bread = new Products("Agege bread", 200.0, 20);
                Products sugar = new Products("Louis sugar", 100.0, 15);

                List<Products> productsList1 = new ArrayList<Products>();
                productsList1.add(milk);
                productsList1.add(biscuit);
                productsList1.add(bread);
                productsList1.add(sugar);

                //the customer's cart
                List<Products> JohnCart = new ArrayList<>();

                //The customer
                Customer customer1 = new Customer("John", JohnCart);

                //Things bought by the customer
                customer1.buy(productsList1 , sugar , 2);
                customer1.buy(productsList1, biscuit, 2);
                customer1.buy(productsList1, sugar, 2);

                //The cashier sells
                Cashier cashier = new Cashier("Ada",2345);
                cashier.sell(customer1, JohnCart);


                Manager manager = new Manager("David" ,2345);
                Applicant applicant1 = new Applicant("Peter", 25, "Male", true,80);
                List<Staff> staffList = new ArrayList<>();

                //The manager hires anew cashier
                manager.hireCashier(staffList,applicant1);

            }

        }



