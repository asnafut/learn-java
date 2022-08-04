package minigames;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Hangman {
    public static void main(String[] args) {
        // User selects a word
        System.out.println("Please select a word");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word;
        try {
            word = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        // User guesses until no tries left or game won
        String[] wordAsArray = word.split("");
        int triesLeft = 5;
        int correctTries = 0;
        String[] foundCharacters = new String[wordAsArray.length];
        while (triesLeft > 0) {
            System.out.println("Guess:");
            String character;
            try {
                character = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
            if (Arrays.asList(wordAsArray).contains(character)) {
                System.out.println("correct");
                if (Arrays.asList(foundCharacters).contains(character) == false) {

                    foundCharacters[correctTries] = character;
                    correctTries = correctTries + 1;
                }
            } else {
                System.out.println("incorrect");
                triesLeft = triesLeft - 1;
                System.out.println("tries left:" + triesLeft);
            }
            boolean isSame = true;
            for (int i = 0; i < wordAsArray.length; i++) {
                if (Arrays.asList(foundCharacters).contains(wordAsArray[i]) == false) {
                    isSame = false;
                }
            }
            if (isSame) {
                System.out.println("You won!");
                triesLeft = 0;
            }
            if (triesLeft == 0){
                System.out.println("no tries left!");
            }
        }
    }
}