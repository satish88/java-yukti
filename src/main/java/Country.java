public class Country {
    public String countryNameGiveInformation(String country) {
        String continent;
        String capital;
        String areaAndPlaceInWorld;
        String currency;
        String president;
        String populationAndRank;

        if (country.equals("China")) {
            continent = "In Asia,";
            capital = " beijing is the capital,";
            areaAndPlaceInWorld = " area is 9.597 million km² and 4th biggest country,";
            currency = " Renminbi is the currency,";
            president = " Xi Jinping is the president, ";
            populationAndRank = " and population is 139.77 crores and has 1st rank in population in whole world";
            return continent + capital + areaAndPlaceInWorld + currency + president + populationAndRank;
        } else {
            return "No information available or check the country name.";
        }
    }
}