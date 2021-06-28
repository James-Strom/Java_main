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
public class Shirt extends Clothing{    
    private char fit = 'U';
    
    public Shirt(String colour, char size, String type, double price, char fit) {
        super (colour, size, type, price);
        
        this.fit = fit;
    }
    
    
//    private int neckSize;
//
//    public int getNeckSize() {
//        return neckSize;
//    }

//    public void setNeckSize(int neckSize) {
//        this.neckSize = neckSize;
//    }

    public char getFit() {
        return fit;
    }

    public void setFit(char fit) {
        this.fit = fit;
    }
    
    
    
    public static void main(String[] args) {
        Shirt myShirt = new Shirt("Blue", 'L', "Formal", 250, 'T');
//              
////        Shirt myShirt = new Shirt();
////        myShirt.setColour("Blue");
////        myShirt.setSize('L');
////        myShirt.setType("Formal Shirt");
////        myShirt.setPrice (250);
        
        myShirt.display();
        System.out.println("Shirt fit: " + myShirt.getFit());
    }
}
