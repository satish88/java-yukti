public class MonthName {
    public static void main(String[] args) {
        int m = 1;
        String[] month = new String[]{
                "0", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
        };
        for (m = 1; m < month.length; m++) {

            System.out.println(m + month[m]);
        }
    }
}
