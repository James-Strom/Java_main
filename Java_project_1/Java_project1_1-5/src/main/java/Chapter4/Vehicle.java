/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4;

/**
 *
 * @author james
 */
//listing 1
// A program that uses the Vehicle class.  
//listing 2
// This program creates two Vehicle objects.
//listing 3
// Add range to Vehicle.
//listing 5
// Use a return value.
//listing 8
/* 
   Add a parameterized method that computes the  
   fuel required for a given distince. 
*/ 


//class Vehicle {  
//  int passengers; // number of passengers  
//  int fuelcap;    // fuel capacity in gallons 
//  int mpg;        // fuel consumption in miles per gallon
//  
//  // Display the range. 
////  void range() { 
//// return mpg * fuelcap; 
//  }
//   // Compute fuel needed for a given distance. 
//  double fuelneeded(int miles) { 
//    return (double) miles / mpg; 
//  } 
//}     System.out.println("Range is " + fuelcap * mpg); 
////  }
//  // Return the range. 
//  int range() { 
//    return mpg * fuelcap; 
//  }
//   // Compute fuel needed for a given distance. 
//  double fuelneeded(int miles) { 
//    return (double) miles / mpg; 
//  } 
//} 

//listing 12
// Add a constructor.
class Vehicle {   
  int passengers; // number of passengers   
  int fuelcap;    // fuel capacity in gallons  
  int mpg;        // fuel consumption in miles per gallon  
  
  // This is a constructor for Vehicle. 
  Vehicle(int p, int f, int m) { 
    passengers = p; 
    fuelcap = f; 
    mpg = m; 
  } 
 
  // Return the range.  
  int range() {  
    return mpg * fuelcap;  
  }  
  
  // Compute fuel needed for a given distance. 
  double fuelneeded(int miles) {  
    return (double) miles / mpg;  
  }  
}   

