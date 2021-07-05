/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listing_16;

/**
 *
 * @author james
 */
class Override { 
  public static void main(String args[]) { 
    B subOb = new B(1, 2, 3); 
 
    subOb.show(); // this calls show() in B 
  } 
}
