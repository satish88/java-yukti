public class SumOrProduct {

    //Write a program that asks the user for a
    // number n and gives them the possibility to choose
    // between computing the sum and computing the product of 1,…,n.

    public static void calculateSumOrProductOfANumberSeries(int number, String calculate) {
        System.out.println("Please Write in String only 'sum' or 'product'. Thank You!!!");
        if (calculate.equals("sum")) {
            int result = 0;
            for (int a = 1; a <= number; a++) {
                result = result + a;
            }
            System.out.println(result);
        } else if (calculate.equals("product")) {
            int result = 1;
            for (int a = 1; a <= number; a++) {
                result = result * a;
            }
            System.out.println(result);
        } else {
            System.out.println("Invalid Input. Check the given details");
        }
    }

    public static void main(String[] args) {
        calculateSumOrProductOfANumberSeries(9, "product");
        calculateSumOrProductOfANumberSeries(10, "sum");
    }
}
