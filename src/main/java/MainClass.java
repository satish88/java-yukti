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

        //Addition
        MathematicalOperation result3 = new MathematicalOperation();
        float adding = result3.addition(4, 7);
        System.out.println(adding);

        //Subtraction
        float subtract = result3.subtraction(9, 3);
        System.out.println(subtract);

        //Multiply
        float multiply = result3.multiplication(4, 2);
        System.out.println(multiply);

        //Divide
        int divide = result3.division(9, 3);
        System.out.println(divide);

        //Angle Name
        Angle result4 = new Angle();
        String angles = result4.angleName(12.5f);
        System.out.println(angles);

        //Prime color
        ColorType result5 = new ColorType();
        String prime = result5.primeColor("pink");
        System.out.println(prime);

        //Secondary color
        String secondary = result5.secondaryColor("Red", "Blue");
        System.out.println(secondary);
    }
}