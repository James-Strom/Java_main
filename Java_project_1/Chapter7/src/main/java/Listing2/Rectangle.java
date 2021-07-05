/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listing2;

/**
 *
 * @author james
 */
// A subclass of TwoDShape for rectangles. 
class Rectangle extends TwoDShape { 
  boolean isSquare() { 
    if(width == height) return true; 
    return false; 
  } 
   
  double area() { 
    return width * height; 
  } 
}
