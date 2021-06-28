/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11_ArrayList;

import java.util.ArrayList;

/**
 *
 * @author james
 */
public class ArrayL {

    public static void main(String[] args) {
        ArrayList<String> names;
        names = new ArrayList();

        names.add("Jamie");
        names.add("Bob");
        names.add("Alice");
        names.add("q");
        names.add(2,"Will");
        
        names.remove(0);
        names.remove(names.size() - 1);
        names.remove("Jamie");
        
        System.out.println(names);
        
    }
}
