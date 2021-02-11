public class MathematicalOperation {

    //addition
    public float addition(float a, float b) {
        return a + b;
    }

    //subtraction
    public float subtraction(float m, float n) {
        if (m > n) {
            return m - n;
        } else {
            return 0;
        }
    }

    //multiply
    public float multiplication(float x, float y) {
        return x * y;
    }

    //divide
    public int division(int i, int r) {
        if (i > r) {
            return i / r;
        } else {
            return 0;
        }
    }
}
