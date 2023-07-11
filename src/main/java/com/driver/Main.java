package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        p.product(5,7);
        p.product(5,7,8);
        p.product(5,8);
    }

}



class Product {
    Product() {
    }

    public int product(int var1, int var2) {
        return var1 * var2;
    }

    public int product(int var1, int var2, int var3) {
        return var1 * var2 * var3;
    }

    public double product(double var1, double var3) {
        return var1 * var3;
    }
}