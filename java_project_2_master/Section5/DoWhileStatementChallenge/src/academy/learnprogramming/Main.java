package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while ((number <= finishNumber) && (count<=4)) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            count++;
            System.out.println("Even number " + number);
        }
        System.out.println("Count is " + count);
    }

    public static boolean isEvenNumber(int number) {
        if((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
