package com.company;

import java.util.Scanner;

public class Customer {

    Seller seller;

    public Customer(Seller seller) {
        this.seller = seller;
    }

    public void buyGoods() { // 고객은 상품을 얻고자 판매자와 대화를 시도함
        Scanner scanner = new Scanner(System.in);

        System.out.print("손님이 왔습니다. 무엇을 구매하나요? (음료, 라면, 과자 중 택1) : ");
        String goods = scanner.next();

        seller.meetCustomer(goods);
    }
}
