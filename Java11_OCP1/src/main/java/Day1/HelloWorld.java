/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

/**
 *
 * @author james
 */
public class HelloWorld {
    public static void main(String[] args) {
    
        String[] names = {"a", "b", "c", "d"};
            for (String name : names) {
                System.out.println("Name is " + name);
            }
        
        int[] sizes = {4,18, 5, 20};
            for (int size : sizes) {
                if (size > 16){break;}
                System.out.println("Size: " + size + ", ");
            }    
        
        int[] nums = {1,2, 4, 6};
            for (int num : nums) {
                System.out.println("Number " + num);
            }
        
//        String message = "Hello Java Bootcamp!";
//        System.out.println(message);
    
    }
}
