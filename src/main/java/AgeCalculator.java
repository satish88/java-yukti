public class AgeCalculator {
    public int ageCounter(int presentYear, int birthYear) {
        if (presentYear >= birthYear) {
            return (presentYear - birthYear);
        } else {
            return Integer.parseInt("invalid year");
        }
    }
}
