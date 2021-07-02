/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7;

/**
 *
 * @author james
 */
//listing 1
//listing 2
// A simple class hierarchy. 
 
// A class for two-dimensional objects. 
//class TwoDShape { 
//  double width; 
//  double height; 
// 
//  void showDim() { 
//    System.out.println("Width and height are " + 
//                       width + " and " + height); 
//  } 
//}

//listing 3
// Private members are not inherited.  
 
// This example will not compile. 
 
// A class for two-dimensional objects. 
//class TwoDShape { 
//  private double width;  // these are 
//  private double height; // now private  
// 
//  void showDim() { 
//    System.out.println("Width and height are " + 
//                       width + " and " + height); 
//  } 
//}

//listing 4
// Use accessor methods to set and get private members. 
 
// A class for two-dimensional objects. 
class TwoDShape { 
  private double width;  // these are 
  private double height; // now private  
 
  // Accessor methods for width and height. 
  double getWidth() { return width; } 
  double getHeight() { return height; } 
  void setWidth(double w) { width = w; } 
  void setHeight(double h) { height = h; } 
 
  void showDim() { 
    System.out.println("Width and height are " + 
                       width + " and " + height); 
  } 
} 

