public class Dynasty {
    public String dynastyTimeline(int year) {

        if (year >= 1 && year <= 225) {
            return "Kushana dynasty";
        }

        if (year >= 275 && year <= 882) {
            return "Kushana dynasty";
        }

        if (year >= 500 && year <= 1200) {
            return "Chalukya dynasty";
        }

        if (year >= 1206 && year <= 1526) {
            return "Delhi Sultanate";
        }

        if (year >= 1526 && year <= 1857) {
            return "Mughal Empire";
        }

        if (year >= 1857 && year <= 1947) {
            return "British Raj";
        }

        if (year >= 1947) {
            return "Independent India";
        } else {
            return "No information available.";
        }
    }
}
