//// * To change this license header, choose License Headers in Project Properties.
//// * To change this template file, choose Tools | Templates
//// * and open the template in the editor.
//// */
////package Chapter7;
////
/////**
//// *
//// * @author james
//// */
//////listing 1
////// A subclass of TwoDShape for triangles. 
////class Triangle extends TwoDShape { 
////  String style; 
////   
////  double area() { 
////    return width * height / 2; 
////  } 
//// 
////  void showStyle() { 
////    System.out.println("Triangle is " + style); 
////  } 
////}
//
////listing 3
//// A subclass of TwoDShape for triangles. 
////class Triangle extends TwoDShape { 
////  String style; 
////   
////  double area() { 
////    return width * height / 2; // Error! can't access 
////  } 
//// 
////  void showStyle() { 
////    System.out.println("Triangle is " + style); 
////  } 
////}
//
//// A subclass of TwoDShape for triangles. 
//class Triangle extends TwoDShape { 
//  String style; 
//   
//  double area() { 
//    return getWidth() * getHeight() / 2;  
//  } 
// 
//  void showStyle() { 
//    System.out.println("Triangle is " + style); 
//  } 
//} 
