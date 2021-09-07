package academy.learnprogramming;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number<0) {
            System.out.println("Invalid Value");
        }

        int printNumber = reverse(number);

        for(int i=0; i < getDigitCount(number); i++) {
            switch(printNumber % 10) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    break;
            }
            printNumber/= 10;
        }
        System.out.println("\n");
    }
    public static int reverse(int number){

        int reverseNumber = 0;

        while(number!=0) {
            int lastDigit = number % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            number /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {

        if ( number < 0) {
            return -1;
        }

        if (number ==0) return 1;

        int count = 0;
        for (int i = 0;number>0;i++){
            number /= 10;
            count++;
        }
        return count;
    }
}

