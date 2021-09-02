package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        for(int i=1; i!=6; i++) {
            System.out.println("Count value is " + i);
        }

        count = 1;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while(count != 6);
    }
}
