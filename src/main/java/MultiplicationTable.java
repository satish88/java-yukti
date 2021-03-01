public class MultiplicationTable {

    //problem 7
    //Write a program that prints a multiplication table for numbers up to 12.
    public static int multiplication(int number, int n) {
        int table;
        for (int a = 1; a <= n; a++) {
            table = number * a;
            System.out.println(table);
        }
        return 0;
    }
}
