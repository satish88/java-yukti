public class MainClass {

    public static void main(String[] args) {
        System.out.println("hello");

        Factorial programme = new Factorial();
        int factorial = Factorial.calculateFactorial(4);
        System.out.println(factorial);

    }
}
