/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson13;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author james
 */
public class myInterface {
    public static void main(String[] args) {
        String[] names = {"Sam", "James", "Jaco", "Kyle"};
        List<String> myList = new ArrayList(Arrays.asList(names));
        
//        myList.replaceAll(s -> s.toUpperCase());
        myList.removeIf(s -> s.equals("Jaco"));
        
//        System.out.println("myList.replaceAll:" + myList);
        System.out.println(myList);
        
        
    }
}
