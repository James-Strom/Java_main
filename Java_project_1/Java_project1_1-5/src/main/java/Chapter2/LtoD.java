/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2;

//listing 15
// Demonstate automatic conversion from long to double. 
class LtoD {    
  public static void main(String args[]) {    
    long L; 
    double D; 
   
    L = 100123285L; 
    D = L; 
   
    System.out.println("L and D: " + L + " " + D); 
   
  }    
}

//listing 16
// *** This program will not compile. *** 
//class LtoD {    
//  public static void main(String args[]) {    
//    long L; 
//    double D; 
//   
//    D = 100123285.0; 
//    L = D; // Illegal!!! 
//   
//    System.out.println("L and D: " + L + " " + D); 
//   
//  }    
//}
