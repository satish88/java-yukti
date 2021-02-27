public class MainClass {

    public static void main(String[] args) {
        System.out.println("hello");

        //calculate factorial
        Factorial result = new Factorial();
        long factorial = Factorial.calculateFactorial(19L);
        System.out.println(factorial);

        //calculate sum by giving one input
        Sum calculation = new Sum();
        int addition = Sum.sumWithOneInput(10);
        System.out.println(addition);

        //calculate sum by giving two inputs
        addition = Sum.sumWithTwoInput(-5, 3);
        System.out.println(addition);

        //calculate exponent
        Power calculate = new Power();
        float exponent = Power.calculatePower(2, -3);
        System.out.println(exponent);

        //sum of the number which are divisible from 3 or 5.
        problem5 numbers = new problem5();
        int sum = problem5.solutionOfProblemFive(2, 4);
        System.out.println(sum);

        //choice between calculating sum or product
        SumOrProduct option = new SumOrProduct();
        int choice = SumOrProduct.calculateSumOrProductOfANumberSeries(-4, "sum");
        choice = SumOrProduct.calculateSumOrProductOfANumberSeries(5, "product");
        System.out.println(choice);
    }
}
