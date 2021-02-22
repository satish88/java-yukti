public class Factorial {
    public static void calculateFactorial(int factorialNumber) {
        int result = 1;
        for (int a = factorialNumber; a >= 1; a = a - 1) {
            result = result * a;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        calculateFactorial(6);
    }
}
