public class MainClass {

    public static void main(String[] args) {
        System.out.println("hello");

        //Clothes according to season
        SeasonCloth result = new SeasonCloth();
        String clothAccordingToSeason = result.clothName("T-shirt");
        System.out.println(clothAccordingToSeason);
    }
}