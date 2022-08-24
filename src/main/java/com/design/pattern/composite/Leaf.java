package com.design.pattern.composite;

public class Leaf implements Component {
    String name;
    int price;

    public Leaf(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void displayPrice() {
        System.out.println(name + ":" + price);
    }
}
