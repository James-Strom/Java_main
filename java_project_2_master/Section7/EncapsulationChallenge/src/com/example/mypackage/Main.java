package com.example.mypackage;

public class Main {

    public static void main(String[] args) {
	    Printer printer1 = new Printer(75, true);

        printer1.tonerFill(25);
        printer1.pagePrint(4);
        System.out.println(printer1.getNumPagesPrinted());

        Printer printer2 = new Printer(50, false);

        System.out.println(printer2.tonerFill(60));

        printer2.pagePrint(9);
        System.out.println(printer2.getNumPagesPrinted());
    }
}
