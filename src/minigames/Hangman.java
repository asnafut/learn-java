package minigames;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hangman {
    public static void main(String[] args) {
        System.out.println("Please select a word");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String word;
        try {
            word = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        String[] wordAsArray = {"word"};
    }
}