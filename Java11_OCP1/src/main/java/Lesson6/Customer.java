/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson6;

/**
 *
 * @author james
 */
public class Customer {
    public String name = "Will Smith";
    public int custID = 255;
    public String address;
    public int orderNum;
    public int age;
    
    
    public Customer (String myAddress, int myOrderNum, int myAge){
        address = myAddress;
        orderNum = myOrderNum;
        age = myAge;
    }
    public void displayCustomer(){
        System.out.println("Customer: " +name);
        System.out.println("Order Number: " + orderNum);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age + "\n");
    }   
    
}
