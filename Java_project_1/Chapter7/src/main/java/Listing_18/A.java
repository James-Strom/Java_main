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
/* Methods with differing type signatures are 
   overloaded and not overridden. */ 
class A { 
  int i, j; 
 
  A(int a, int b) { 
    i = a; 
    j = b; 
  } 
 
  // display i and j 
  void show() { 
    System.out.println("i and j: " + i + " " + j); 
  } 
} 
