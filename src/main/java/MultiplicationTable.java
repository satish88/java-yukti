import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable {

    //problem 7
    //Write a program that prints a multiplication table for numbers up to 12.
    public static List<Integer> multiplicationTable(int number, int n) {
        int table;
        List<Integer> multiply = new ArrayList<>();
        if (n != 0) {
            for (int a = 1; a <= n; a++) {
                table = number * a;
                multiply.add(table);
            }
        } else {
            multiply.add(0);
        }
        return multiply;
    }
}
