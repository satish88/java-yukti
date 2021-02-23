public class Sum {

    //
    public static void sumWithOneInput(int n) {
        int result = 0;
        for (int number = 1; number <= n; number = number + 1) {
            result = result + number;
        }
        System.out.println(result);

        //result = 0
        // number = 1
        // 1<=5 true
        //result = 1
        // number = 2
        // 2<=5 true
        // result = 3
        // number = 3
        //3<=5 true
        // result 6
        // number 4
        // 4 < = 5 true
        //result 10
        // number 5
        // 5<=5 true
        // result 15
        // number 6
        // 6<= 5 false
        // print result 15


    }

    public static void sumWithTwoInput(int a, int n) {
        int result = 0;
        for (int number = a; number <= n; number = number + 1) {
            result = result + number;
        }
        System.out.println(result);

        //result 0
        // number 2
        // 2<= 4 true
        //result 2
        //number 3
        //3<=4 true
        // result 5
        // number 4
        // 4<=4 true
        //result 9
        //number 5
        // 5<= 4 false
        // print result 9

    }

    public static void main(String[] args) {
        sumWithOneInput(5);
        sumWithTwoInput(2, 4);
    }

}
