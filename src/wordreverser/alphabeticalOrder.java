package wordreverser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class alphabeticalOrder {
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

        while (x < length) {
            wordAsArrayHidden[x] = " ";
            x = x + 1;
        }
        x = 0;
        int c = 0;
        while (x < length) {
            if (wordAsArray[x].equals("a")) {
                wordAsArrayHidden[c] = "a";
                c = c + 1;
            }
            x = x + 1;
        }
        x = 0;
        while (x < length) {
            if (wordAsArray[x].equals("b")) {
                wordAsArrayHidden[c] = "b";
                c = c + 1;
            }
            x = x + 1;
        }
        x = 0;
        while (x < length) {
            if (wordAsArray[x].equals("c")) {
                wordAsArrayHidden[c] = "c";
                c = c + 1;
            }
            x = x + 1;
        }
        x = 0;
        while (x < length) {
            if (wordAsArray[x].equals("d")) {
                wordAsArrayHidden[c] = "d";
                c = c + 1;
            }
            x = x + 1;
        }
        x = 0;
        while (x < length) {
            if (wordAsArray[x].equals("e")) {
                wordAsArrayHidden[c] = "e";
                c = c + 1;
            }
            x = x + 1;
        }
        x = 0;
        while (x < length) {
            if (wordAsArray[x].equals("f")) {
                wordAsArrayHidden[c] = "f";
                c = c + 1;
            }
            x = x + 1;
        }
        x = 0;
        while (x < length) {
            if (wordAsArray[x].equals("g")) {
                wordAsArrayHidden[c] = "g";
                c = c + 1;
            }
            x = x + 1;
        }
        x = 0;
        while (x < length) {
            if (wordAsArray[x].equals("h")) {
                wordAsArrayHidden[c] = "h";
                c = c + 1;
            }
            x = x + 1;
        }
        x = 0;
        while (x < length) {
            if (wordAsArray[x].equals("i")) {
                wordAsArrayHidden[c] = "i";
                c = c + 1;
            }
            x = x + 1;
        }
        x = 0;
        while (x < length) {
            if (wordAsArray[x].equals("j")) {
                wordAsArrayHidden[c] = "j";
                c = c + 1;
            }
            x = x + 1;
        }
        x = 0;
        while (x < length) {
            if (wordAsArray[x].equals("k")) {
                wordAsArrayHidden[c] = "k";
                c = c + 1;
            }
            x = x + 1;
        }
        x = 0;
        while (x < length) {
            if (wordAsArray[x].equals("l")) {
                wordAsArrayHidden[c] = "l";
                c = c + 1;
            }
            x = x + 1;
        }
        x = 0;
        while (x < length) {
            if (wordAsArray[x].equals("m")) {
                wordAsArrayHidden[c] = "m";
                c = c + 1;
            }
            x = x + 1;
        }
        x = 0;
        while (x < length) {
            if (wordAsArray[x].equals("n")) {
                wordAsArrayHidden[c] = "n";
                c = c + 1;
            }
            x = x + 1;
        }
        x = 0;
        while (x < length) {
            if (wordAsArray[x].equals("o")) {
                wordAsArrayHidden[c] = "o";
                c = c + 1;
            }
            x = x + 1;
        }
        x = 0;
        while (x < length) {
            if (wordAsArray[x].equals("p")) {
                wordAsArrayHidden[c] = "p";
                c = c + 1;
            }
            x = x + 1;
        }
        x = 0;
        while (x < length) {
            if (wordAsArray[x].equals("q")) {
                wordAsArrayHidden[c] = "q";
                c = c + 1;
            }
            x = x + 1;
        }
        x = 0;
        while (x < length) {
            if (wordAsArray[x].equals("r")) {
                wordAsArrayHidden[c] = "r";
            }
            x = x + 1;
        }
        x = 0;
        while (x < length) {
            if (wordAsArray[x].equals("s")) {
                wordAsArrayHidden[c] = "s";
                c = c + 1;
            }
            x = x + 1;
        }
        x = 0;
        while (x < length) {
            if (wordAsArray[x].equals("t")) {
                wordAsArrayHidden[c] = "t";
                c = c + 1;
            }
            x = x + 1;
        }
        x = 0;
        while (x < length) {
            if (wordAsArray[x].equals("u")) {
                wordAsArrayHidden[c] = "u";
                c = c + 1;
            }
            x = x + 1;
        }
        x = 0;
        while (x < length) {
            if (wordAsArray[x].equals("v")) {
                wordAsArrayHidden[c] = "v";
                c = c + 1;
            }
            x = x + 1;
        }
        x = 0;
        while (x < length) {
            if (wordAsArray[x].equals("w")) {
                wordAsArrayHidden[c] = "w";
                c = c + 1;
            }
            x = x + 1;
        }
        x = 0;
        while (x < length) {
            if (wordAsArray[x].equals("x")) {
                wordAsArrayHidden[c] = "x";
                c = c + 1;
            }
            x = x + 1;
        }
        x = 0;
        while (x < length) {
            if (wordAsArray[x].equals("y")) {
                wordAsArrayHidden[c] = "y";
                c = c + 1;
            }
            x = x + 1;
        }
        x = 0;
        while (x < length) {
            if (wordAsArray[x].equals("z")) {
                wordAsArrayHidden[c] = "z";
                c = c + 1;
            }
            x = x + 1;
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