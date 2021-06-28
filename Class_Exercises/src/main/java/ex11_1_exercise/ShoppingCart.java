package ex11_1_exercise;

// import statements here:

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class ShoppingCart {
    public static void main(String[] args){
	// Declare a LocalDateTime object, orderDate
        LocalDateTime orderDate;

        
	// Initialize the orderDate to the current date and time. Print it.
        orderDate = LocalDateTime.now();
        System.out.println("Current local time: " + orderDate);

	// Format orderDate using ISO_LOCAL_DATE; Print it.
        String formDate = orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("Formated order date: " + formDate);

    }
}