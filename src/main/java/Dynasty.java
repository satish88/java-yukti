public class Dynasty {
    public String dynastyTimeline(int year) {
        String output = "";

        if (year < 0) {
            return "no Information. Invalid yr";
        }


        if (year >= 1 && year <= 225) {
            output = output + "Kushana dynasty";
        }

        if (year >= 275 && year <= 882) {
            output = output + "Pallava dynasty";
        }

        if (year >= 500 && year <= 1200) {
            output = output + " Chalukya dynasty";
        }

        if (year >= 1206 && year <= 1526) {
            output = output + "Delhi Sultanate";
        }

        if (year >= 1526 && year <= 1857) {
            output = output + " Mughal Empire";
        }

        if (year >= 1857 && year <= 1947) {
            output = output + " British Raj";
        }

        if (year >= 1947) {
            output = output + " Independent India";
        }

        return output;
    }
}
