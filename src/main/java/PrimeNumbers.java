public class PrimeNumbers {

    //problem 8
    //Write a program that prints all prime numbers.
    //work in progress.....uncompleted.

    public static String findPrimeNumber(int number) {
        String prime = "Number is prime number.";
        String nonPrime = "Number is not prime";
        if (number <= 1) {
            System.out.println(number + nonPrime);
            // return nonPrime;
        } else if (number == 2) {
            System.out.println(number + prime);
        } else if (number > 2) {
            int counter = number / 2;
            for (int a = 2; a <= counter; a++) {
                if (number % a == 0) {
                    System.out.println(a + prime);
                } else {
                    System.out.println(a + nonPrime);
                }
            }
        }
        return "Thank You!!!";
    }

    //public static int printPrimeNumber(int number){
    //  for (int i = 2; i<=number;i++){
    //    if(findPrimeNumber(i)){
    //      System.out.println(i);
    //       }
    // }
    //     return 0;
    // }
    public static void main(String[] args) {
        String result = findPrimeNumber(20);
        System.out.println(result);
    }
}
