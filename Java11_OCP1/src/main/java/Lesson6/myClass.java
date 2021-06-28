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
public class myClass {
    public static void main(String[] args) {
        Customer customer1 = new Customer("22 bank", 34, 343);
        Customer customer2 = new Customer("64 West", 26, 125);
        
        customer1.age = 25;
        customer2.name = "Duke";
        
        customer1.displayCustomer();
        customer2.displayCustomer();
    }
    
}
