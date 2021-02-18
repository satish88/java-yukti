public class Power {
    public static void main(String[] args) {
        int p = 123;
        int power = 5;
        for (int i = 1; i <= p; i = i * 5) {
            power = power * i;
            System.out.println(power);
        }
    }
}
