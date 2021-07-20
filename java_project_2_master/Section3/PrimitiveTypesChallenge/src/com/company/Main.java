package com.company;

public class Main {

    public static void main(String[] args) {

        byte challengeByteNumber = 1;
        short challengeShortNumber = 2;
        int challengeIntNumber = 3;

        long challengeLongNumber = 50000 + 10 * (challengeShortNumber + challengeIntNumber + challengeByteNumber);
//        long challengeLongNumber = 50000L + 10L * (challengeShortNumber + challengeIntNumber + challengeByteNumber);
        System.out.println(challengeLongNumber);
    }
}
