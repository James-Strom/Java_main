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
public class Order {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.setPrice(10.00);
        item1.setId(10);
        item1.setDesc("White shoes");
        
        System.out.println("The price: " + item1.getPrice());
        System.out.println("Item Id: " + item1.getId());
        System.out.println("Description: " + item1.getDesc());        
    }
}
