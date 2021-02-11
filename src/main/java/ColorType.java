public class ColorType {

    public String primeColor(String color) {
        String type1 = "Prime Color";
        System.out.println("Please! Write the color name's first letter in capital");

        if (color.equals("Red")) {
            return type1;
        }

        if (color.equals("Yellow")) {
            return type1;
        }

        if (color.equals("Blue")) {
            return type1;
        } else {
            return "Invalid input! This not prime color.";
        }
    }

    public String secondaryColor(String color1, String color2) {
        String type2 = " Secondary Color";
        System.out.println("Please! Write the color name's first letter in capital");

        if (color1.equals("Red") && color2.equals("Yellow")) {
            return "Orange" + type2;
        }

        if (color1.equals("Yellow") && color2.equals("Red")) {
            return "Orange" + type2;
        }
        if (color1.equals("Yellow") && color2.equals("Blue")) {
            return "Green" + type2;
        }

        if (color1.equals("Blue") && color2.equals("Yellow")) {
            return "Green" + type2;
        }

        if (color1.equals("Blue") && color2.equals("Red")) {
            return "Violate" + type2;
        }

        if (color1.equals("Red") && color2.equals("Blue")) {
            return "Violate" + type2;
        } else {
            return "This is not Secondary color.";
        }

    }
}
