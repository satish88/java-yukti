public class MainClass {

    public static void main(String[] args) {
        System.out.println("hello");

        //call method for scoring
        FirstClass result = new FirstClass();
        int score = FirstClass.scoring(7, 2);
        System.out.println(score);

        //call method for introducing
        String write = FirstClass.introducing("Hello ", "My name is Yukti.");
        System.out.println(write);
    }
}
