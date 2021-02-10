public class Angle {

    public String angleName(float degree) {
        String a = " degree angle is a ";
        String angle;

        if (degree > 0 && degree < 90) {
            angle = "Acute angle.";
            return (degree + a + angle);
        }

        if (degree == 90) {
            angle = "Right angle.";
            return (degree + a + angle);
        }

        if (degree > 90 && degree < 180) {
            angle = "Obtuse angle.";
            return (degree + a + angle);
        }

        if (degree == 180) {
            angle = "Straight angle.";
            return (degree + a + angle);
        }

        if (degree > 180 && degree < 360) {
            angle = "Reflex angle.";
            return (degree + a + angle);
        }

        if (degree == 360) {
            angle = "Full turn angle.";
            return (degree + a + angle);
        } else {
            return "invalid degree.";
        }
    }
}
