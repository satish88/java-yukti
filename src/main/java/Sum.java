public class Sum {

    public static void sumWithOneInput(int n) {
        int result = 0;
        for (int number = 1; number <= n; number = number + 1) {
            result = result + number;
        }
        System.out.println(result);
    }

    public static void sumWithTwoInput(int a, int n) {
        int result = 0;
        for (int number = a; number <= n; number = number + 1) {
            result = result + number;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        sumWithOneInput(3);
        sumWithTwoInput(2, 4);
    }

}
