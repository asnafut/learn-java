package wordreverser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordReverser {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word;
        {
            try {
                word = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
        int length = word.length();
        String[] wordAsArray = word.split("");
        int x = 0;
       /*  while (x < length) {
            System.out.print(wordAsArray[x]);
            x = x + 1;
        } */

        x = length - 1;
        while (0 <= x) {
            System.out.print(wordAsArray[x]);
            x = x - 1;
        }
    }
}