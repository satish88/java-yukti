public class LeapYear {

    //problem 10
    //Write a program that prints the next 20 leap years.
    public static int calculateLeapYear(int year) {
        int leapYear = 1;
        if (year % 4 == 0) {
            for (int a = 0; a < 80; a = a + 4) {
                leapYear = year + a;
                System.out.println(leapYear);
            }
            return leapYear + 4;
        } else if ((year - 1) % 4 == 0) {
            int leapYearPlusOneExtraMoreYear = year + 3;
            for (int a = 0; a < 80; a = a + 4) {
                leapYear = leapYearPlusOneExtraMoreYear + a;
                System.out.println(leapYear);
            }
            return leapYear + 4;
        } else if ((year - 2) % 4 == 0) {
            int leapYearPlusTwoExtraMoreYear = year + 2;
            for (int a = 0; a < 80; a = a + 4) {
                leapYear = leapYearPlusTwoExtraMoreYear + a;
                System.out.println(leapYear);
            }
            return leapYear + 4;
        } else if ((year - 3) % 4 == 0) {
            int leapYearPlusThreeExtraMoreYear = year + 1;
            for (int a = 0; a < 80; a = a + 4) {
                leapYear = leapYearPlusThreeExtraMoreYear + a;
                System.out.println(leapYear);
            }
            return leapYear + 4;
        } else {
            return 0;
        }
    }
}
