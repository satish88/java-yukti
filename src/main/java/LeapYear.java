import java.util.ArrayList;
import java.util.List;

public class LeapYear {

    //problem 10
    //Write a program that prints the next 20 leap years.
    public static boolean checkLeapYear(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }

    public static List<Integer> printLeapYear(int Year, int numbersOfLeapYear) {
        List<Integer> leapYear = new ArrayList<>();
        for (int i = 0; i <= (numbersOfLeapYear * 4); i++) {
            Year = Year + 1;
            if (checkLeapYear(Year)) {
                leapYear.add(Year);
            }
        }
        return leapYear;
    }

    public static void main(String[] args) {


    }
}
