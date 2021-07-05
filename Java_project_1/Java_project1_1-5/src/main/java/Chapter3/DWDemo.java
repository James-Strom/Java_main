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
//listing 22
// Demonstrate the do-while loop. 
class DWDemo {   
  public static void main(String args[])   
    throws java.io.IOException { 
 
    char ch; 
 
    do { 
      System.out.print("Press a key following by ENTER: "); 
      ch = (char) System.in.read(); // get a char 
    } while(ch != 'q'); 
  }   
}

