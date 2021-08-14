package com.company;

public class Pos {

    private int beverage;
    private int ramen;
    private int snack;

    public Pos(int beverage, int ramen, int snack) {
        this.beverage = beverage;
        this.ramen = ramen;
        this.snack = snack;
    }

    public Pos() {
    }

    public int getBeverage() {
        return beverage;
    }

    public int getRamen() {
        return ramen;
    }

    public int getSnack() {
        return snack;
    }

    public void setBeverage(int beverage) {
        this.beverage = beverage;
    }

    public void setRamen(int ramen) {
        this.ramen = ramen;
    }

    public void setSnack(int snack) {
        this.snack = snack;
    }

    public boolean isBeverage() {
        return getBeverage() > 0;
    }

    public boolean isRamen() {
        return getRamen() > 0;
    }

    public boolean isSnack() {
        return getSnack() > 0;
    }

    @Override
    public String toString() {
        return "음료 : " + getBeverage() + "\n라면 : " + getRamen() + "\n과자 : " + getSnack() + "\n세팅 완료됐습니다.";
    }
}
