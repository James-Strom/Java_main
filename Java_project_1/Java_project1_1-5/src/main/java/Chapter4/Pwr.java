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
//listing 13
//class Pwr { 
//  double b; 
//  int e; 
//  double val; 
// 
//  Pwr(double base, int exp) { 
//    b = base; 
//    e = exp; 
// 
//    val = 1; 
//    if(exp==0) return; 
//    for( ; exp>0; exp--) val = val * base; 
//  } 
// 
//  double get_pwr() { 
//    return val; 
//  } 
//}
//listing 15
class Pwr { 
  double b; 
  int e; 
  double val; 
 
  Pwr(double base, int exp) { 
    this.b = base; 
    this.e = exp; 
 
    this.val = 1; 
    if(exp==0) return; 
    for( ; exp>0; exp--) this.val = this.val * base;
    
    //    listing 16
//    Pwr(double b, int e) { 
//      this.b = b; 
//      this.e = e; 
//
//      val = 1; 
//      if(e==0) return; 
//      for( ; e>0; e--) val = val * b; 
//    }
  }
  
 
  double get_pwr() { 
    return this.val; 
  } 
}

