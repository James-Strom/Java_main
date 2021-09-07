package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(NumberToWords.getDigitCount(9760));
        NumberToWords.numberToWords(9760);
        System.out.println(NumberToWords.getDigitCount(007));
        NumberToWords.numberToWords(007);
        System.out.println(NumberToWords.getDigitCount(500));
        NumberToWords.numberToWords(500);
        NumberToWords.numberToWords(0);
    }
}
