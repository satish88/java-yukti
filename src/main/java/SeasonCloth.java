public class SeasonCloth {

    public String clothNameTellsSeason(String cloth) {
        String n = ", We wear in ";
        String season;
        System.out.println("Please! write cloth name's first letter in capital.");

        if (cloth.equals("Sweater")) {
            season = "winter season.";
            return (cloth + " image " + n + season);
        }

        if (cloth.equals("T-shirt")) {
            season = "summer season.";
            return (cloth + " image" + n + season);
        }

        if (cloth.equals("Rain-coat")) {
            season = "rainy season.";
            return (cloth + " image " + n + season);
        } else {
            System.out.println("invalid input ");
            return "not listed cloth.";
        }

    }
}
