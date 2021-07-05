/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listing7;

// Return a String object. 
class ErrorMsg { 
  String msgs[] = { 
    "Output Error", 
    "Input Error", 
    "Disk Full", 
    "Index Out-Of-Bounds" 
  }; 
 
  // Return the error message. 
  String getErrorMsg(int i) { 
    if(i >=0 & i < msgs.length) 
      return msgs[i]; 
    else 
      return "Invalid Error Code"; 
  } 
} 

