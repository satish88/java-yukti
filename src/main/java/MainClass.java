public class MainClass {

    public static void main(String[] args) {
        System.out.println("hello");

        //Clothes according to season
        SeasonCloth result1 = new SeasonCloth();
        String clothAccordingToSeason = result1.clothNameTellsSeason("Sweater");
        System.out.println(clothAccordingToSeason);

        //Crop on which timing
        CropType result2 = new CropType();
        String cropAndTime = result2.cropGrowInTheSeason("Wheat");
        System.out.println(cropAndTime);
    }
}