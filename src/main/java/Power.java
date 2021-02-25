public class Power {

    public static void calculatePower(int number, int power) {
        int result = 1;
        if (power >= 0) {
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }
            System.out.println(result);
        } else {
            System.out.println("Enter positive power");
        }

    }

    public static void main(String[] args) {
        calculatePower(5, -3);
        int i = 3;
        int power = 4;
        int result = i;

        // 2 * 2 * 2
        // 5^4 = 5 * 5 * 5*5

        // counter = 1 -> power
        //       i * i;

        for (int counter = 1; counter < power; counter = counter + 1) {
            result = result * i;
        }
        System.out.println(result);

    }

    // i = 2, power = 3
    // counter = 1
    // 1 <=3  true
    // i = 2
    // counter = 2
    // 2 <= 3 true
    // i = 4
    // counter = 3
    // 3 <= 3 true
    // i = 8
    // counter = 4
    // 4 <= 3 false
    // Result= 8

}
