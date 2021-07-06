/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listing_20;

public interface MyIF { 
  // This is a "normal" interface method declaration. 
  // It does NOT define a default implementation. 
  int getUserID(); 
 
  // This is a default method. Notice that it provides 
  // a default implementation. 
  default int getAdminID() { 
    return 1; 
  } 
}
