package minigames;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // User selects a word
        Scanner sc = new Scanner(new File("C:\\dev\\learn-java\\src\\minigames\\HangmanWords.txt"));
        List<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }

        String[] randomWord = lines.toArray(new String[0]);
        Random random = new Random();
        int wordPosition = random.nextInt(randomWord.length);
        String word = randomWord[wordPosition];
        System.out.println(word);
        int length = word.length();
        // System.out.println(randomWord[word]);
        // User guesses until no tries left or game won
        String[] wordAsArrayHidden = word.split("");
        String arrayAsWord = "";
        int x = 0;
        while (x < length) {
            wordAsArrayHidden[x] = "_";
            x = x + 1;
        }
        x = 0;
        int triesLeft = 5;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int correctTries = 0;
        String[] foundCharacters = new String[wordAsArrayHidden.length];
        int tries = 0;
        String triedLetters = "";
        while (triesLeft > 0) {

            x = 0;
            String character;
            System.out.print("Guess:");
            tries = tries + 1;

            System.out.print(" ");
            try {
                character = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }

            String[] wordAsArray = word.split("");

            System.out.println("Tried letters: " + triedLetters);

            if (Arrays.asList(wordAsArrayHidden).contains(character)) {
                System.out.println("you have already found the character " + character);
            } else if ((word).equals(character)) {
                System.out.println("Correct! You win! The word was " + word + " you tried " + tries + " times");
                triesLeft = -1;
                arrayAsWord = word;
            }

            else if (Arrays.asList(wordAsArray).contains(character)) {
                System.out.println("correct");

                while (x < length) {
                    if (wordAsArray[x].equals(character)) {
                        wordAsArrayHidden[x] = character;
                    }
                    x = x + 1;
                }
                x = 0;
                arrayAsWord = "";
                while (x < length) {
                    arrayAsWord = arrayAsWord.concat(wordAsArrayHidden[x]);
                    x = x + 1;
                }
                if (Arrays.asList(foundCharacters).contains(character) == false) {

                    foundCharacters[correctTries] = character;
                    correctTries = correctTries + 1;
                }
            } else {
                System.out.println("incorrect");
                triesLeft = triesLeft - 1;
                System.out.println("tries left:" + triesLeft);
                triedLetters = triedLetters + character + ", ";
            }
            wordAsArray = word.split("");
            if (triesLeft > 0) {
                System.out.println(arrayAsWord);
            }
            boolean isSame = true;
            for (int i = 0; i < wordAsArray.length; i++) {
                if (Arrays.asList(foundCharacters).contains(wordAsArray[i]) == false) {
                    isSame = false;

                }
            }
            if (isSame && triesLeft > 0) {
                System.out.println("Correct! You win! The word was " + word + " you tried " + tries + " times");
                triesLeft = -1;
            }
            if (triesLeft == 0) {
                System.out.println("no tries left!");
            }
        }
    }

    {
        {

        }
    }
}