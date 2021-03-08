import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable {

    //problem 7
    //Write a program that prints a multiplication table for numbers up to 12.
    public static List<Integer> multiplicationTable(int number, int n) {
        int table;
        List<Integer> multiply = new ArrayList<>();
        for (int a = 0; a <= n; a++) {
            table = number * a;
            multiply.add(table);
        }
        return multiply;
    }
}
