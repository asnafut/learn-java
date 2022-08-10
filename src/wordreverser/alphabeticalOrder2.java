package wordreverser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class alphabeticalOrder2 {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String word;
        try {
            word = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        int length = word.length();

        String[] wordAsArray = word.split("");
        int x = 0;

        String[] wordAsArrayHidden = word.split("");

        String alphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
        String[] alphabetAsArray = alphabet.split("");

        while (x < length) {
            wordAsArrayHidden[x] = " ";
            x = x + 1;
        }
        x = 0;
        int c = 0;
        int k = 0;
        int i = 0;
        while (i < 30) {
            while (x < length) {
                if (wordAsArray[x].equals(alphabetAsArray[k])) {
                    wordAsArrayHidden[c] = alphabetAsArray[k];
                    c = c + 1;
                }
                x = x + 1;
            }
            x = 0;
            k = k + 1;
            i = i + 1;
        }

        String arrayAsWord = "";
        x = 0;
        arrayAsWord = "";
        while (x < length) {
            arrayAsWord = arrayAsWord.concat(wordAsArrayHidden[x]);
            x = x + 1;
        }
        System.out.println(arrayAsWord);

    }
}