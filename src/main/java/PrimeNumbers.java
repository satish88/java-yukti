public class PrimeNumbers {

    //problem 8
    //Write a program that prints all prime numbers.
    //work in progress.....uncompleted.

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

    public static int printPrimeNumber(int number) {
        int print = 0;
        if (number < 2) {
            System.out.println("Smallest prime number is 2. Please enter the value more than 1. Thank You!!!!!!");
        } else {
            for (int a = 2; a <= number; a++) {
                if (findPrimeNumber(a)) {
                    print = a;
                    System.out.println(print + " is a prime number.");
                }
            }
        }
        return print;
    }

    public static void main(String[] args) {
        boolean result = findPrimeNumber(17);
        System.out.println(result);
        int print = printPrimeNumber(20);
        System.out.println(print);
    }
}
