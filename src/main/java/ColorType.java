public class ColorType {

    // primeColor is a public method which takes an argument of type String and name color and
    // returns a String.
    public String primeColor(String color) {
        System.out.println("Please! Write the color name's first letter in capital");

        if (color.equals("Red") || color.equals("Yellow") || color.equals("Blue")) {
            return "Prime Color";
        } else {
            return "Invalid input! This not prime color.";
        }
    }

    public String secondaryColor(String color1, String color2) {
        String type2 = " Secondary Color";
        System.out.println("Please! Write the color name's first letter in capital and both colors must be prime. ");

        if (color1.equals("Red") && color2.equals("Yellow") || color1.equals("Yellow") && color2.equals("Red")) {
            return "Orange" + type2;
        }

        if (color1.equals("Yellow") && color2.equals("Blue") || color1.equals("Blue") && color2.equals("Yellow")) {
            return "Green" + type2;
        }

        if (color1.equals("Blue") && color2.equals("Red") || color1.equals("Red") && color2.equals("Blue")) {
            return "Violate" + type2;
        } else {
            return "No Color Available";
        }
    }
}
