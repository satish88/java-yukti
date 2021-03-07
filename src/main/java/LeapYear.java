import java.util.ArrayList;
import java.util.List;

public class LeapYear {

    //problem 10
    //Write a program that prints the next 20 leap years.
    public static boolean checkLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }

    public static List<Integer> printLeapYear(int year, int numbersOfYear) {
        int n = numbersOfYear;
        List<Integer> leapYear = new ArrayList();
        for (int a = 0; a <= (n * 4); a++) {
            year = year + 1;
            if (checkLeapYear(year)) {
                leapYear.add(year);
            }
        }
        return leapYear;
    }
}