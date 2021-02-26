public class Factorial {
    public static long calculateFactorial(long factorialNumber) {
        if (factorialNumber == 0L) {
            return 1L;
        } else if (factorialNumber > 0) {
            long result = 1L;
            for (long a = factorialNumber; a >= 1; a = a - 1) {
                result = result * a;
            }
            return result;
        } else {
            return 0;
        }
    }
}

