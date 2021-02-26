public class MainClass {

    public static void main(String[] args) {
        System.out.println("hello");

        Factorial result = new Factorial();
        long factorial = Factorial.calculateFactorial(19L);
        System.out.println(factorial);

        Sum calculation = new Sum();
        int addition = Sum.sumWithOneInput(10);
        System.out.println(addition);

        addition = Sum.sumWithTwoInput(-5, 3);
        System.out.println(addition);

    }
}
