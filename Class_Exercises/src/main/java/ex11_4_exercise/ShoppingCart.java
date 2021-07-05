package ex11_4_exercise;

import java.util.ArrayList;

public class ShoppingCart {
    public static void main(String[] args){   
        // Declare, instantiate, and initialize an ArrayList of Strings.  Print and test your code.
        ArrayList<String> items = new ArrayList<>();
        items.add("Shirt");
        items.add("WristBand");
        items.add("Pants");
        System.out.println(items);
       
        // add (insert) another element at a specific index 
        items.add(2, "Belt");
        System.out.println(items);

	// Check for the existence of a specific String element.  
        //   If it exists, remove it.
        if (items.contains ("Shirt")){
           items.remove("Shirt");
         }
         System.out.println(items);
    }
}
