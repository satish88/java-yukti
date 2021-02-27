public class SumOrProduct {

    //Write a program that asks the user for a
    // number n and gives them the possibility to choose
    // between computing the sum and computing the product of 1,…,n.

    public static int calculateSumOrProductOfANumberSeries(int number, String calculate) {
        System.out.println("Please Write in String only 'sum' or 'product'. Thank You!!!");
        System.out.println("Please write positive number");
        if (calculate.equals("sum")) {
            int result = 0;
            if (number >= 0) {
                for (int a = 1; a <= number; a++) {
                    result = result + a;
                }
                return result;
            }
        } else if (calculate.equals("product")) {
            int result = 1;
            if (number >= 0) {
                for (int a = 1; a <= number; a++) {
                    result = result * a;
                }
                return result;
            }
        }
        return 0;
    }
}
