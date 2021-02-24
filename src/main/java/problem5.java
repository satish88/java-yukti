public class problem5 {

    // Modify the previous program such that only multiples of three
    // or five are considered in the sum, e.g. 3, 5, 6, 9, 10, 12, 15 for n=17

    public static void solutionOfProblemFive(int a, int n) {
        int sum = 0;
        for (int i = a; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

    /* public static void my(int n) {
        // 1 + 2 + 3 + 4 +5
        int result = 0;
        for (int counter = 1;
             counter <= n;
             counter = counter + 1) {
            result = result + counter;
        }
        System.out.println(result);
    }*/
    // n = 3
    // result = 0
    // counter = 1
    //  1 <= 3 true
    // result = 1
    // counter = 2
    // 2 <= 3 true
    // result = 3
    // counter = 3
    // 3 <= 3 true
    // result = 6


    public static void main(String[] args) {
        solutionOfProblemFive(2, 9);
    }


}
