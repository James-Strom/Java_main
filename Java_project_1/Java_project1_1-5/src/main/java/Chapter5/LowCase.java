/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5;

//listing 29
// Lowercase letters. 
class LowCase {  
  public static void main(String args[]) { 
    char ch;  
  
    for(int i=0; i < 10; i++) { 
      ch = (char) ('A' + i);  
      System.out.print(ch); 
 
      // This statement turns on the 6th bit.   
      ch = (char) ((int) ch | 32); // ch is now lowercase  
  
      System.out.print(ch + " ");  
    } 
  } 
}