/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11;

//import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
//import java.time.chrono.JapaneseDate;

/**
 *
 * @author james
 */
public class DateOb {
    public static void main(String[] args) {
//        LocalDate myDate = LocalDate.now().minusYears(4);
        LocalDateTime myDate = LocalDateTime.now();
        System.out.println("Today's Date: " + myDate);
//        JapaneseDate jDate = JapaneseDate.from(myDate);
//        System.out.println("Japanese date: " + jDate);
        String aDate = myDate.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Date in ISO_Date time: " + aDate);
        String fDate = myDate.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("Formatted in Medium format style: " + fDate);
    }
}
