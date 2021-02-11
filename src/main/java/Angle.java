public class Angle {

    public String angleName(float degree) {

        if (degree > 0 && degree < 90) {
            return "Acute angle.";
        }

        if (degree == 90) {
            return "Right angle.";
        }

        if (degree > 90 && degree < 180) {
            return "Obtuse angle.";
        }

        if (degree == 180) {
            return "Straight angle.";
        }

        if (degree > 180 && degree < 360) {
            return "Reflex angle.";
        }

        if (degree == 360) {
            return "Full turn angle.";
        } else {
            return "invalid degree.";
        }
    }
}
