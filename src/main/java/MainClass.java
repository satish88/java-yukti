public class MainClass {

    public static void main(String[] args) {
        System.out.println("hello");

        Factorial result = new Factorial();
        int factorial = Factorial.calculateFactorial(4);
        System.out.println(factorial);

        Sum calculation = new Sum();
        int addition = Sum.sumWithOneInput(10);
        System.out.println(addition);

        addition = Sum.sumWithTwoInput(-5, 3);
        System.out.println(addition);

    }
}
