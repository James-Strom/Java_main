/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listing4;

/**
 *
 * @author james
 */
// A subclass of TwoDShape for triangles. 
class Triangle extends TwoDShape { 
  String style; 
   
  double area() { 
    return getWidth() * getHeight() / 2;  
  } 
 
  void showStyle() { 
    System.out.println("Triangle is " + style); 
  } 
} 
