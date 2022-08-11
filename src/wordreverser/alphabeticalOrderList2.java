package wordreverser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class alphabeticalOrderList2 {
    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\dev\\learn-java\\src\\wordreverser\\wordList.txt"));
        List<String> lines = new ArrayList<String>();
        while (sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }

        String[] wordList = lines.toArray(new String[0]);
        int length = wordList.length;
        int x = 0;

        String alphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
        String[] alphabetAsArray = alphabet.split("");
        String[] wordAsArrayHidden = new String[wordList.length * 30];
        while (x < length * 30) {
            wordAsArrayHidden[x] = "";
            x = x + 1;
        }

        x = 0;
        int z = 0;
        int c = 0;
        int k = 0;
        int i = 0;
        while (i < 30) {

            String[] wordsToSort = new String[length];
            int countChars = 0;
            int currentPosition = -1;
            while (x < length) {
                String[] wordAsArray = wordList[z].split("");
                if (wordAsArray[0].equals(alphabetAsArray[k])) {
                    wordAsArrayHidden[c] = wordList[z];
                    wordsToSort[countChars] = wordList[z];

                    if (currentPosition == -1) {
                        currentPosition = c;
                    }
                    c = c + 1;
                    countChars++;
                }
                z = z + 1;
                x = x + 1;
            }
            if (countChars >= 2) {
                for (int j = 0; j < alphabetAsArray.length; j++) {
                    for (int l = 0; l < countChars; l++) {
                        String[] wordAsArray = wordsToSort[l].split("");
                        if (wordAsArray[1].equals(alphabetAsArray[j])) {
                            wordAsArrayHidden[currentPosition] = wordsToSort[l];
                            currentPosition++;
                        }
                    }
                }
            }
            z = 0;
            x = 0;
            k = k + 1;
            i = i + 1;
        }
        String arrayAsWord = "";
        x = 0;
        arrayAsWord = "";

        while (x < length) {
            arrayAsWord = arrayAsWord.concat(wordAsArrayHidden[x]) + " ";
            x = x + 1;
        }
        System.out.println(arrayAsWord);
    }
}