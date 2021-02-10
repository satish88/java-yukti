public class CropType {

    public String cropGrowInTheSeason(String crop) {
        String type;
        String month;
        System.out.println("Please! Write crop name in capital.");

        if (crop.equals("Wheat")) {
            type = ", Rabi/winter crop ,";
            month = " November to April.";
            return crop + type + month;
        }

        if (crop.equals("Rice")) {
            type = ", kharif/monsoon crop ,";
            month = " July to October";
            return crop + type + month;
        } else {
            return "Invalid crop name";
        }
    }
}
