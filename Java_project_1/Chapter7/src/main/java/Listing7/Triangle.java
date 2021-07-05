/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listing7;

/**
 *
 * @author james
 */
// A subclass of TwoDShape for triangles. 
class Triangle extends TwoDShape { 
  private String style; 
   
  // A default constructor. 
  Triangle() { 
    super(); 
    style = "none"; 
  } 
 
  // Constructor 
  Triangle(String s, double w, double h) { 
    super(w, h); // call superclass constructor 
 
    style = s;  
  } 
 
  // One argument constructor. 
  Triangle(double x) { 
    super(x); // call superclass constructor 
 
    style = "filled";  
  } 
 
  double area() { 
    return getWidth() * getHeight() / 2; 
  } 
 
  void showStyle() { 
    System.out.println("Triangle is " + style); 
  } 
} 
