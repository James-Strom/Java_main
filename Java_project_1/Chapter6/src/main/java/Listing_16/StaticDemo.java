/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listing_16;

// Use a static variable.
class StaticDemo {
  int x; // a normal instance variable
  static int y; // a static variable

  // Return the sum of the instance variable x
  // and the static variable y.
  int sum() {
    return x + y;
  }
}