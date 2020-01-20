/*package com.company;


import app.factory.*;
import com.company.globals.Globals;
import domain.basket.Basket;
import domain.customer.Customer;
import domain.product.Product;
import domain.storage.Storage;
import domain.supermarket.Supermarket;

import java.util.*;
//import java.io.*;


public class Controller {


    public static void getCommand() {
        Scanner in = new Scanner(System.in);
        String command = in.next();
        Storage storage = StorageFactory.createSimpleStorage();
        while (!command.equals(Globals.OPEN_SUPERMARKET_COMMAND )) {

            if (command.equals(Globals.ADD_PRODUCT_TO_STORAGE_COMMAND)) {
                String nameProduct = in.next();
                int cost = in.nextInt();
                boolean isForChild = in.nextBoolean();
                Product product = ProductFactory.createSimpleProduct(nameProduct, cost, isForChild);
                storage.addProduct(product);
            } else {
                in.nextLine();
                System.out.println(Globals.OUT_WRONG_COMMAND);
            }
            command = in.next();
        }
        Supermarket supermarket = SupermarketFactory.createSimpleSupermarket(storage);
        while(!command.equals(Globals.CLOSE_SUPERMARKET_COMMAND)) {
            command = in.next();
            if (command.equals(Globals.ADD_CUSTOMER_COMMAND)) {
                String nameCustomer = in.next();
                boolean isChild = in.nextBoolean();
                Customer customer = CustomerFactory.createSimpleCustomer(nameCustomer, isChild);
                supermarket.addCustomer(customer);
            } else if (command.equals(Globals.CUSTOMER_ADDED_PRODUCT)) {
                String nameCustomer = in.next();
                String nameProduct = in.next();
                Customer customer = supermarket.findCustomer(nameCustomer);
                Product product = storage.findProduct(nameProduct);
                if ((customer != null) && (product != null)) {
                    if (customer.addProduct(product)) {
                        storage.deleteProduct(product);
                        System.out.println(product.getName() + " added to " + customer.getName() + "'s basket");
                    }
                }
            } else if (command.equals(Globals.INFO_COMMAND)) {
                supermarket.getInfo();
            } else if(command.equals(Globals.CLOSE_SUPERMARKET_COMMAND)) {
                supermarket.close();
             } else {
                in.nextLine();
                System.out.println(Globals.OUT_WRONG_COMMAND);
            }
        }
    }
}

*/