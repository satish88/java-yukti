public class AgeCalculator {
    public int ageCounter(int presentYear, int birthYear) {
        if (presentYear < 0 || birthYear < 0) {
            return 0;
        }
        if (presentYear >= birthYear) {
            return (presentYear - birthYear);
        } else {
            System.out.println("Impossible value");
            return 0;
        }
    }

    public static void main(String[] args) {
//        AgeCalculator calculator = new AgeCalculator();
//        calculator.ageCounter(-3, -2);
        Integer a = Integer.parseInt("abc");
        System.out.println(a);

    }
}
