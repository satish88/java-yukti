public class CropType {

    public String cropGrowInTheSeason(String crop) {
        String type;
        String month;
        System.out.println("Please! Write crop name in capital.");

        if (crop.equals("Wheat") || crop.equals("Barley") || crop.equals("Oats") || crop.equals("Chickpea") || crop.equals("Linseed") || crop.equals("Mustard")) {
            type = "Rabi/winter crop ,";
            month = " November to April.";
            return type + month;
        }

        if (crop.equals("Rice") || crop.equals("Maize") || crop.equals("Sorghum") || crop.equals("Bajra") || crop.equals("Ragi") || crop.equals("Soyabean") || crop.equals("Groundnut") || crop.equals("Cotton")) {
            type = "kharif/monsoon crop ,";
            month = " July to October";
            return type + month;
        } else {
            return "Invalid crop name";
        }
    }
}
