/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listing_12;

class SeriesDemo2 { 
  public static void main(String args[]) { 
    ByTwos twoOb = new ByTwos(); 
    ByThrees threeOb = new ByThrees(); 
    Listing7_8_9.Series ob; 
 
    for(int i=0; i < 5; i++) { 
      ob = twoOb; 
      System.out.println("Next ByTwos value is " + 
                          ob.getNext()); 
      ob = threeOb; 
      System.out.println("Next ByThrees value is " + 
                          ob.getNext()); 
    } 
  } 
}

