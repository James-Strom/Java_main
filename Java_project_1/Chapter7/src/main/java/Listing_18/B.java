/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listing_18;

/**
 *
 * @author james
 */
// Create a subclass by extending class A. 
class B extends A { 
  int k; 
 
  B(int a, int b, int c) { 
    super(a, b); 
    k = c;
  } 
 
  // overload show() 
  void show(String msg) { 
    System.out.println(msg + k); 
  } 
} 
