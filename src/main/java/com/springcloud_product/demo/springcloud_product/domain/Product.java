package com.springcloud_product.demo.springcloud_product.domain;

import java.io.Serializable;

/**
 * @Author: Elvis
 * @Description:
 * @Date: 2020/2/14 3:59
 */
public class Product implements Serializable {

    private int id;

    private String name;

    private int price;

    /**
     * 库存
     */
    private int store;

    public Product(){}

    public Product(int id, String name, int price, int store){
        this.id = id ;
        this.name = name;
        this.price = price;
        this.store = store;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStore() {
        return store;
    }

    public void setStore(int store) {
        this.store = store;
    }
}
