package com.example.mypackage;

public class Printer {

    private int tonerLevel;
    private int numPagesPrinted;
    private boolean bothSides;

    public Printer(int tonerLevel, boolean bothSides) {
        if(tonerLevel >= 0 && tonerLevel<= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.bothSides = bothSides;
        this.numPagesPrinted = 0;
    }

    //Cannot be static as "this" cannot be referenced
    public int tonerFill(int addFill) {

        if(addFill > 0 && addFill <= 100){
            if(this.tonerLevel + addFill > 100) {
                return -1;
            }
            this.tonerLevel += addFill;
            return this.tonerLevel;
        } else{
            return -1;
        }
    }

    public int pagePrint(int pages) {
        int numPagesToPrint = pages;
        if(this.bothSides) {
            numPagesToPrint = (pages/2) + (pages%2);
            System.out.println("Printing on both sides.");
        }
        this.numPagesPrinted += numPagesToPrint;
        return numPagesToPrint;
    }

    public int getNumPagesPrinted() {
        return numPagesPrinted;
    }
}
