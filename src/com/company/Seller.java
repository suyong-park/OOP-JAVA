package com.company;

import java.util.Scanner;

public class Seller {

    Pos pos = new Pos();

    public void meetCustomer(String goods) { // 판매자가 고객과 만나 요구사항을 들었음
        boolean has_goods = isGoods(goods);
        if(!has_goods) { // 상품이 준비되지 않은 경우
            System.out.println("해당 상품은 준비되어 있지 않습니다.");
            System.out.println("안녕히 가세요.");
        }
        else { // 상품을 판매할 수 있는 경우
            System.out.println(goods + "이(가) 판매됐습니다.");
            setPos(goods);
            System.out.println("감사합니다. 안녕히 가세요.");
        }
    }

    public void setPos(String goods) {
        switch (goods) {
            case "음료" :
                pos.setBeverage(pos.getBeverage() - 1);
                break;
            case "라면" :
                pos.setRamen(pos.getRamen() - 1);
                break;
            case "과자" :
                pos.setSnack(pos.getSnack() - 1);
                break;
        }

        System.out.println(pos);
    }

    public boolean isGoods(String goods) {
        switch (goods) {
            case "음료" :
                return pos.isBeverage();
            case "라면" :
                return pos.isRamen();
            case "과자" :
                return pos.isSnack();
            default : // 고객이 요구하는 상품이 판매하지 않는 경우
                return false;
        }
    }

    public void initPos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("판매자가 출근했습니다.");
        System.out.println("음료, 라면, 과자 순서대로 개수를 입력하세요. (0 이상의 양수)");

        int beverage, ramen, snack;

        do {
            System.out.print("음료 : ");
            beverage = scanner.nextInt();
        } while (beverage < 0);

        do {
            System.out.print("라면 : ");
            ramen = scanner.nextInt();
        } while (ramen < 0);

        do {
            System.out.print("과자 : ");
            snack = scanner.nextInt();
        } while (snack < 0);

        pos = new Pos(beverage, ramen, snack);
        System.out.println(pos);
    }
}
