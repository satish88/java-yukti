public class MathematicalOperation {

    public float addition(float a, float b) {
        return a + b;
    }

    public float subtraction(float m, float n) {
        if (m > n) {
            return m - n;
        } else {
            return 0;
        }
    }

    public float multiplication(float x, float y) {
        return x * y;
    }

    public int division(int i, int r) {
        if (i > r) {
            return i / r;
        } else {
            return 0;
        }
    }
}
