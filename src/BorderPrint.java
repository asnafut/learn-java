import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BorderPrint {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // input from user
        System.out.println("type some words");
        String sentence;
        try {
            sentence = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // split into words
        String[] words = sentence.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            // You may want to check for a non-word character before blindly
            // performing a replacement
            // It may also be necessary to adjust the character class
            words[i] = words[i].replaceAll("[^\\w]", "");
        }

        // find length from longest word

        String longestWord = findLongestWord(words);

        // print top border longest word + 2
        for (int i = -2; i < longestWord.length(); i++) {
            System.out.print("*");
        }

        // loop for side borders + print word + find gap + side border
        System.out.println("");
        for (String word : words) {
            System.out.print("*");
            System.out.print(word);
            int lengthDifferenceFromWords;
            lengthDifferenceFromWords = longestWord.length() - word.length();
            for (int i = 0; i < lengthDifferenceFromWords; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }

        // print bottom border longest word + 2
        for (int i = -2; i < longestWord.length(); i++) {
            System.out.print("*");
        }
    }

    public static String findLongestWord(String[] words) {
        String longestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }


}
