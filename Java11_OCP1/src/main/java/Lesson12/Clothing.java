/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson12;

/**
 *
 * @author james
 */
public class Clothing {
    private String colour;
    private char size;
    private String type;
    private double price = 0.0;
    
    public Clothing (String colour, char size, String type, double price) {
        this.colour = colour;
        this.size = size;
        this.type = type;
        this.price = price;
                
    }
    
    public void display() {
        System.out.println("Colour: " + colour);
        System.out.println("Size: " + size);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
    }   
    
}
