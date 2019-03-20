import java.util.Random;

public class MovieQuoteInfo {
    public static void main(String []args){
        Random randOne = new Random();
        int q = randOne.nextInt(2); // determines random selection's values, starting from 0 to indicated end number
        if(q == 0) {
            System.out.println("Tonight, we dine in hell!");
        }
        else if(q == 1) {
            System.out.println("I don't know what we're yelling about!");
        }
        else {
            System.out.println("Stand still and die like a man!");
        }

    }
}
