import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable {

    //problem 7
    //Write a program that prints a multiplication table for numbers up to 12.
    public static List<Integer> multiplication(int number, int n) {
        int table;
        List<Integer> abc = new ArrayList();
        for (int a = 1; a <= n; a++) {
            table = number * a;
            // System.out.println(table);
            abc.add(table);
        }
        return abc;


    }

}
