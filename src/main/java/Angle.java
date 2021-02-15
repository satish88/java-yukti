public class Angle {

    public String angleName(float degree) {

        if (degree == 0) {
            return "Zero angle.";
        } else if (degree > 0 && degree < 90) {
            return "Acute angle.";
        } else if (degree == 90) {
            return "Right angle.";
        } else if (degree > 90 && degree < 180) {
            return "Obtuse angle.";
        } else if (degree == 180) {
            return "Straight angle.";
        } else if (degree > 180 && degree < 360) {
            return "Reflex angle.";
        } else if (degree == 360) {
            return "Full turn angle.";
        } else {
            return "invalid degree.";
        }
    }
}
