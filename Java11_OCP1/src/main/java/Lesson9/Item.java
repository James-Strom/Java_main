/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson9;

/**
 *
 * @author james
 */
public class Item {
//    private double price = 15.50;
//    public void setPrice (double price) {
//        this.price = price;
    
    private int id;
    private String desc;
    private double price;
    private static int nextId = 3;

    public int getId() {
        return id;
    }

    public void setId(int newId) {
        if (newId >= 100 && newId <=300) {
            id = newId;
            return;
        } else{
        System.out.println("Invalid ID");
        }
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Item.nextId = nextId;
    }
    
    
}
