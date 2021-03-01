public class Sum {

    // problem 4
    //Write a program that asks the user for a number n
    // and prints the sum of the numbers 1 to n

    public static int sumWithOneInput(int n) {
        int result = 0;
        if (n > 0) {
            for (int number = 1; number <= n; number = number + 1) {
                result = result + number;
            }
        } else if (n < 0) {
            for (int number = -1; number >= n; number = number - 1) {
                result = result + number;
            }
        }
        return result;
    }

    public static int sumWithTwoInput(int a, int n) {
        int result = 0;
        if (a < n) {
            for (int number = a; number <= n; number = number + 1) {
                result = result + number;
            }
        } else if (a > n) {
            for (int number = a; number >= n; number = number - 1) {
                result = result + number;
            }
        }
        return result;
    }
}
