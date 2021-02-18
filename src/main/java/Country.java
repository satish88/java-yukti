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
            currency = " Chinese Yuan,";
            president = " Xi Jinping is the president, ";
            populationAndRank = " and population is 139.77 crores and has 1st rank in whole world";
            return continent + capital + areaAndPlaceInWorld + currency + president + populationAndRank;
        }

        if (country.equals("India")) {
            continent = "In Asia";
            capital = " New delhi is the capital, ";
            areaAndPlaceInWorld = " area is 3.287 million km² and 7th biggest country, ";
            currency = " Indian Rupee, ";
            president = " Ram Nath Kovind is the president, ";
            populationAndRank = " and population is 136.64 crores and has 2nd rank in the whole world";
            return continent + capital + areaAndPlaceInWorld + currency + president + populationAndRank;
        }

        if (country.equals("USA")) {
            continent = "In North America";
            capital = " Washington, D.C. is the capital, ";
            areaAndPlaceInWorld = " area is 9.834 million km² and 3rd biggest country, ";
            currency = " U.S. dollar, ";
            president = " Joe Biden is the president, ";
            populationAndRank = " and population is 32.82 crores and has 3rs rank in the whole world";
            return continent + capital + areaAndPlaceInWorld + currency + president + populationAndRank;
        } else {
            return "No information available or check the country name.";
        }
    }
}