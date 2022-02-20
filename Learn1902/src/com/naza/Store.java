package com.naza;

public class Store {
    // instance fields
    String productType;
    double price;

    // constructor method
    public Store(String product) {
        productType = product;
        double initialPrice = 0;
        price = initialPrice;
    }

    //advertise method
    public void advertise() {
        System.out.println("Sell " + productType + "!");
        System.out.println("Hey hey com here");
    }

    //greet Customer method
    public void greetCustomer(String customer) {
        System.out.println("Welcome to the store, " + customer + "!");
    }

    // increase price method
    public void increasePrice(double priceToAdd) {
        double newPrice = price + priceToAdd;
        price = newPrice;
        System.out.println("From January 1 in our store new price of fish: " + price);
    }

    //get Price with tax method
    public double getPriceWithTax() {
        double tax = 0.02;
        double totalPrice = price + price * tax;
        return totalPrice;
    }

    //String toString method
    public String toString() {
    return "productType";
    }

    // main method
    public static void main(String[] args) {
        Store lidl = new Store("fish");
        //call method on lidl object
        lidl.advertise();
        lidl.greetCustomer("dear Naza");
        lidl.increasePrice(99);
        double fishPrice = lidl.getPriceWithTax();
        System.out.println(fishPrice);
    }
}
