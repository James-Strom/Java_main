/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listing_10_11;

//listing 11
// Implement Series. 
class ByThrees implements Listing7_8_9.Series { 
  int start; 
  int val; 
 
  ByThrees() { 
    start = 0; 
    val = 0; 
  } 
 
  public int getNext() { 
    val += 3; 
    return val; 
  } 
 
  public void reset() { 
    start = 0; 
    val = 0; 
  } 
 
  public void setStart(int x) { 
    start = x; 
    val = x; 
  } 
}

