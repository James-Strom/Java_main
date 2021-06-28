/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson10;

/**
 *
 * @author james
 */
public class Employee {
    public String name1="Fred Smith";
    public String name2="red Smith";
    
    public void areNamesEqual() {
//        if (name1 == name2) {
//            System.out.println("Same name");
//        }
//        else {
//            System.out.println("Different name");
//        }

        String n = (name1 == name2) ? "Same Name": "Different Name";
        System.out.println(n);
        }       
    }

