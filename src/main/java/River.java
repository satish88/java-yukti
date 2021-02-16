public class River {
    public String riverName(String river) {
        int length;
        String km = "Km";
        System.out.println("Please! Write the river name's first letter capital.");

        if (river.equals("Ganga")) {
            length = 2510;
            return length + km;
        }

        if (river.equals("Indus")) {
            length = 3180;
            return length + km;
        }

        if (river.equals("Brahmaputra")) {
            length = 3848;
            return length + km;
        }

        if (river.equals("Yamuna")) {
            length = 1376;
            return length + km;
        }

        if (river.equals("Godavari")) {
            length = 1465;
            return length + km;
        }

        if (river.equals("Kaveri")) {
            length = 805;
            return length + km;
        }


        if (river.equals("Namrada")) {
            length = 1312;
            return length + km;
        }

        if (river.equals("Tapti")) {
            length = 724;
            return length + km;
        }

        if (river.equals("Mahanadi")) {
            length = 858;
            return length + km;
        }

        if (river.equals("Krishna")) {
            length = 1400;
            return length + km;
        } else {
            System.out.println("check the river name");
            return "unlisted river";
        }
    }
}
