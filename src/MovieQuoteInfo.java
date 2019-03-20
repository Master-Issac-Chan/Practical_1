import java.util.Random;

public class MovieQuoteInfo {
    public static void main(String []args){
        Random randOne = new Random();
        int q = randOne.nextInt(3); // determines random selection's values
        if(q == 0) {
            System.out.println("Tonight, we dine in hell!");
            System.out.println("300");
            System.out.println("King Leonidas");
            System.out.println("2006");
        }
        else if(q == 1) {
            System.out.println("I don't know what we're yelling about!");
            System.out.println("Anchorman: The Legend of Ron Burgundy");
            System.out.println("Brick Tamland");
            System.out.println("2004");
        }
        else {
            System.out.println("Tony, there was no other way.");
            System.out.println("Avengers: Infinity War");
            System.out.println("Doctor Strange");
            System.out.println("2018");
        }

    }
}
