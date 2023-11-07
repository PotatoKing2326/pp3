import java.util.Calendar;

public class MyCalendar {
    static int year = 2023;
    static int month = 4;
    static int day = 9;

    static String[] months = {"january","february","march","april","may","june","july","august","september","october","november","december"};


    /*
     * Returns date
     * in the form yyyy-mm-dd
     */
    static String myDate(int year, int month, int day){
        if(month<10){

        }
        return "My date: " + year + "-" + month + "-" + day;
    }

    /*
     * Returns the number of days
     * from the beginning of year
     */

    /*
     * Returns month name
     */
    static String MonthName(int number){
        return "Month name: " + months[number-1];
    }
     
}
