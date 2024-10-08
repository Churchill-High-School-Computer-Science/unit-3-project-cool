import java.util.HashSet;
import java.util.Scanner;





public class game {
    public static void main(String[] args) {
        Scanner txt = new Scanner(System.in);

        String[] words = {"APPLE", "FLOAT", "SLOPE" , "FAIR", "BRICK", "PLANE"};
        String wordsToGuess = words[(int) (Math.random() * words.length)];
        int wordLength = 5;

        boolean wordGuessed = false;
        int tries = 6;

        System.out.println("~~~ Wordle ~~~");


        while (tries > 0 && !wordGuessed) {
            System.out.println("Enter a 5 letter word: ");
            String flipping = txt.nextLine().toUpperCase();

        if (flipping.length() != wordLength) {
            System.out.println("I said 5 letter word idiot");
            continue;


        }


        boolean[] correctPosition = new boolean[wordLength];
        boolean[] wrongPosition = new boolean[wordLength];

        HashSet<Character> unmatchedLetters = new HashSet<>();

        for (int i = 0; i < wordLength; i++) {
            if (flipping.charAt(i) == wordsToGuess.charAt(i)) {
                correctPosition[i] = true;
            } else {
                unmatchedLetters.add(wordsToGuess.charAt(i));
            }
        }
        wordGuessed = true;

        for (int i = 0; i < wordLength; i++) {
            if (!correctPosition[i]) {
                wordGuessed = false;
                break;
            }
        }

        for(int i = 0; i < wordLength; i++){
            if (correctPosition[i]) {
                System.out.print(flipping.charAt(i) + " (Green) ");
            } else if (wrongPosition[i]) {
                System.out.print(flipping.charAt(i) + " (Yellow) ");
            } else {
                System.out.print(flipping.charAt(i) + " (Grey) ");
            }
        }

        System.out.println();

        if(!wordGuessed){
            tries--;
            System.out.println("Tries left: " + tries);
        }
    }  
     if (wordGuessed){
        System.out.println("Wowzers, you guessed the word correctly!");
     } else {
        System.out.println("You idiot, the word was " + wordsToGuess + "!");
     }
     txt.close();



    }
}
