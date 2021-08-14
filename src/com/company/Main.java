package com.company;

public class Main {

    public static void main(String[] args) {

        Seller seller = new Seller();
        seller.initPos();

        Customer customer = new Customer(seller);
        customer.buyGoods();
    }
}


