import java.util.Scanner;
import java.util.HashSet;





public class game {
    public static void main(String[] args) {
        Scanner txt = new Scanner(System.in);

        String[] words = {"APPLE", "FLOAT", "SLOPE" , "FAIR", "BRICK", "PLANE"};
        String wordsGuess = words[(int) (Math.random() * words.length)];
        int wordLength = 5;

        boolean wordGuessed = false;
        int tries = 6;

        System.out.println("~~~ Wordle ~~~");


        while (tries > 0 && !wordGuessed) {
            System.out.println("Enter a 5 letter word: ");
            String flipping = txt.nextLine().toUpperCase();

        if (flipping.length() != wordLength) {
            System.out.println("I said 5 letter word idiot");

        }

    }
}
