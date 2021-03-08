import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    //problem 8
    //Write a program that prints all prime numbers.
    public static boolean findPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        } else if (number == 2) {
            return true;
        } else if (number > 2) {
            for (int a = 2; a < number; a++) {
                int n = number % a;
                if (n == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static List<Integer> printPrimeNumber(int number) {
        List<Integer> primeNumber = new ArrayList<>();
        if (number >= 2) {
            for (int a = 2; a <= number; a++) {
                if (findPrimeNumber(a)) {
                    primeNumber.add(a);
                }
            }
        } else {
            primeNumber.add(null);
        }
        return primeNumber;
    }
}
