/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5;

//listing 16
// Search an array using for-each style for.  
class Search {  
  public static void main(String args[]) {  
    int nums[] = { 6, 8, 3, 7, 5, 6, 1, 4 }; 
    int val = 5;  
    boolean found = false;  
 
    // Use for-each style for to search nums for val. 
    for(int x : nums) {  
      if(x == val) {  
        found = true;  
        break;  
      }  
    }  
  
    if(found)   
      System.out.println("Value found!");  
  }  
}
