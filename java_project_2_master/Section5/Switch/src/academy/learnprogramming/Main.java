package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if(value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }
//
//        int switchValue = 3;
//
//        switch(switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//
//            case 2:
//                System.out.println("Value was 2");
//                break;
//
//            default:
//                System.out.println("Was not 1 or 2");
//                break;
//        }

//        Challenge
        char charValue = 'F';

        switch(charValue) {
            case 'A': case'B': case'C': case'D': case'E':
                System.out.println(charValue +" was found");
                break;

            default:
                System.out.println("Value was not found");
                break;
        }

    }
}
