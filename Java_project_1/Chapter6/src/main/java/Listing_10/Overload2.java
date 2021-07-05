/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listing_10;

/* Automatic type conversions can affect 
   overloaded method resolution. 
*/ 
class Overload2 { 
  void f(int x) { 
    System.out.println("Inside f(int): " + x); 
  } 
 
  void f(double x) { 
    System.out.println("Inside f(double): " + x); 
  } 
} 