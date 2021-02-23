public class Factorial {
    public static int calculateFactorial(int factorialNumber) {
        int result = 1;
        for (int a = factorialNumber; a >= 1; a = a - 1) {
            result = result * a;
        }
        return result;
    }

    //result= 1
    //a = 4
    // 4>= 1 true
    // result = 4
    // a = 3
    // 3 >=1 true
    // result 12
    // a = 2
    // 2> = 1 true
    // result = 24
    // a= 1
    // 1 >=1 true
    //result = 24
    // a = 0
    // 0>=1 false
    // return 24
}

