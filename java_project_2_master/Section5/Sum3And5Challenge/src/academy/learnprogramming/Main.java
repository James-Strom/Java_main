package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        int total = 0;

        for (int i=1;i<=1000;i++) {
            if (isDivisible(i)) {
                count++;
                System.out.println(i + " is divisible by 3 and 5");
                total += i;
                if (count == 5) {
                    break;
                }
            }

        }
        System.out.println("Sum of total= " + total);
    }


    public static boolean isDivisible(int n) {
        int div3 = n%3;
        int div5 = n%5;
        if ((div3==0)&&(div5==0)) {
            return true;
        } else {
            return false;
        }

    }

}
