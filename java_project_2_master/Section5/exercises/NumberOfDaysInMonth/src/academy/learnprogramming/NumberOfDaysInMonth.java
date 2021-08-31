package academy.learnprogramming;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        int year4 = year%4;
        int year100 = year%100;
        int year400 = year%400;

        if (year >= 1 && year<= 9999) {
            if(year4 == 0 && year100!=0) {
                return true;
            }
            else if(year400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (((month < 1) || (month > 12)) || ((year < 1) || (year > 9999))) {
            return -1;
        }
        if (isLeapYear(year) && month == 2) {
            return 29;
        }

        switch (month) {
            case 11: case 4: case 6: case 9:
                return 30;
            case 2:
                return 28;
            default:
                return 31;
        }
    }
}
