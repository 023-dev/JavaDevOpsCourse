package com.kosta.exam01;

public class GoodsVO {
    private int number;
    private String item;
    private int qty;
    private int price;

    @Override
    public String toString() {
        return "GoodsVO{" +
                "number=" + number +
                ", item='" + item + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }

    public GoodsVO(int number, String item, int qty, int price) {
        this.number = number;
        this.item = item;
        this.qty = qty;
        this.price = price;
    }
    public GoodsVO(){}

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
