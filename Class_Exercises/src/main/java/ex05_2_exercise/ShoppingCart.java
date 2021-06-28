package ex05_2_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        String message = custName + " wants to purchase a several items.";

        //Declare and initialize the items String array
        String[] items = {"Shirt","Shoes","Shorts"};       


        // Change message to show the number of items purchased.
        message = custName + " wants to buy "+items.length+ " items.";

        System.out.println(message);
        // Print an element from the items array.
        System.out.println(items[1]);        
        
    }

}

