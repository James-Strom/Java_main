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
class B extends A {
  int k; 
 
  B(int a, int b, int c) { 
    super(a, b); 
    k = c; 
  } 
 
  // display k – this overrides show() in A 
  void show() { 
    System.out.println("k: " + k); 
  } 
} 
