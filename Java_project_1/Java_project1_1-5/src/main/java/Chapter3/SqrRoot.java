/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3;

/**
 *
 * @author james
 */
//listing 11
// Show square roots of 1 to 99 and the rounding error. 
class SqrRoot {     
  public static void main(String args[]) {     
    double num, sroot, rerr;  
 
    for(num = 1.0; num < 100.0; num++) {  
      sroot = Math.sqrt(num); 
      System.out.println("Square root of " + num + 
                          " is " + sroot); 
 
      // compute rounding error 
      rerr = num - (sroot * sroot); 
      System.out.println("Rounding error is " + rerr); 
      System.out.println(); 
    }  
  }     
}
