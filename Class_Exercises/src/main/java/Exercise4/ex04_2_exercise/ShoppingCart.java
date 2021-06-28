package ShoppingCart;

public class ShoppingCart {
    
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity, and total.   
        double price=10;
        double tax = 1.15;
        int quantity = 2;
        double total;
        // Modify message to include quantity 
        message = custName+" wants to purchase "+quantity+" "+itemDesc;
        
        System.out.println(message);
        
        // Calculate total and then print the total cost
        total = quantity * (price * tax);
        
        System.out.println("Price after tax "+total);        
    }    
}

