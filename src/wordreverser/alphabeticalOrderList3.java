package wordreverser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class alphabeticalOrderList3 {
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
        String[] wordAsArrayHidden = new String[wordList.length];
        while (x < length) {
            wordAsArrayHidden[x] = "";
            x = x + 1;
        }

        x = 0;
        int z = 0;
        int c = 0;
        int k = 0;
        int i = 0;
        while (i < 30) {
            while (x < length) {
                String[] wordAsArray = wordList[z].split("");
                if (wordAsArray[0].equals(alphabetAsArray[k])) {
                    wordAsArrayHidden[c] = wordList[z];
                    c = c + 1;
                }
                z = z + 1;
                x = x + 1;
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
            arrayAsWord = arrayAsWord.concat(wordAsArrayHidden[x]);
            x = x + 1;
        }
        System.out.println(arrayAsWord);

        String[] wordAsArrayHiddenB = new String[wordList.length];
        String[] wordAsArrayHiddenA = new String[wordList.length];
        String[] wordAsArrayHiddenC = new String[wordList.length];
        String[] wordAsArrayHiddenD = new String[wordList.length];
        String[] wordAsArrayHiddenE = new String[wordList.length];
        String[] wordAsArrayHiddenF = new String[wordList.length];
        String[] wordAsArrayHiddenG = new String[wordList.length];
        String[] wordAsArrayHiddenH = new String[wordList.length];
        String[] wordAsArrayHiddenI = new String[wordList.length];
        String[] wordAsArrayHiddenJ = new String[wordList.length];
        String[] wordAsArrayHiddenK = new String[wordList.length];
        String[] wordAsArrayHiddenL = new String[wordList.length];
        String[] wordAsArrayHiddenM = new String[wordList.length];
        String[] wordAsArrayHiddenN = new String[wordList.length];
        String[] wordAsArrayHiddenO = new String[wordList.length];
        String[] wordAsArrayHiddenP = new String[wordList.length];
        String[] wordAsArrayHiddenQ = new String[wordList.length];
        String[] wordAsArrayHiddenR = new String[wordList.length];
        String[] wordAsArrayHiddenS = new String[wordList.length];
        String[] wordAsArrayHiddenT = new String[wordList.length];
        String[] wordAsArrayHiddenU = new String[wordList.length];
        String[] wordAsArrayHiddenV = new String[wordList.length];
        String[] wordAsArrayHiddenW = new String[wordList.length];
        String[] wordAsArrayHiddenX = new String[wordList.length];
        String[] wordAsArrayHiddenY = new String[wordList.length];
        String[] wordAsArrayHiddenZ = new String[wordList.length];
        z = 0;
        k = 0;
        x = 0;
        c = 0;

        while (x < length) {
            String[] wordAsArrayhiddenAsWord = wordAsArrayHidden[z].split("");
            if (wordAsArrayhiddenAsWord[0].equals("a")) {
                wordAsArrayHiddenA[c] = wordAsArrayHidden[z];
                c = c + 1;
            }
            x = x + 1;
            z = z + 1;
        }
        c = 0;
        z = 0;
        x = 0;
        while (x < length) {
            String[] wordAsArrayhiddenAsWord = wordAsArrayHidden[z].split("");
            if (wordAsArrayhiddenAsWord[0].equals("b")) {
                wordAsArrayHiddenB[c] = wordAsArrayHidden[z];
                c = c + 1;
            }
            z = z + 1;
            x = x + 1;
        }
        c = 0;
        z = 0;
        x = 0;
        while (x < length) {
            String[] wordAsArrayhiddenAsWord = wordAsArrayHidden[z].split("");
            if (wordAsArrayhiddenAsWord[0].equals("c")) {
                wordAsArrayHiddenC[c] = wordAsArrayHidden[z];
                c = c + 1;
            }
            z = z + 1;
            x = x + 1;
        }
        c = 0;
        z = 0;
        x = 0;
        while (x < length) {
            String[] wordAsArrayhiddenAsWord = wordAsArrayHidden[z].split("");
            if (wordAsArrayhiddenAsWord[0].equals("d")) {
                wordAsArrayHiddenD[c] = wordAsArrayHidden[z];
                c = c + 1;
            }
            z = z + 1;
            x = x + 1;
        }
        c = 0;
        z = 0;
        x = 0;
        while (x < length) {
            String[] wordAsArrayhiddenAsWord = wordAsArrayHidden[z].split("");
            if (wordAsArrayhiddenAsWord[0].equals("e")) {
                wordAsArrayHiddenE[c] = wordAsArrayHidden[z];
                c = c + 1;
            }
            z = z + 1;
            x = x + 1;
        }
        c = 0;
        z = 0;
        x = 0;
        while (x < length) {
            String[] wordAsArrayhiddenAsWord = wordAsArrayHidden[z].split("");
            if (wordAsArrayhiddenAsWord[0].equals("f")) {
                wordAsArrayHiddenF[c] = wordAsArrayHidden[z];
                c = c + 1;
            }
            z = z + 1;
            x = x + 1;
        }
        c = 0;
        z = 0;
        x = 0;
        while (x < length) {
            String[] wordAsArrayhiddenAsWord = wordAsArrayHidden[z].split("");
            if (wordAsArrayhiddenAsWord[0].equals("g")) {
                wordAsArrayHiddenG[c] = wordAsArrayHidden[z];
                c = c + 1;
            }
            z = z + 1;
            x = x + 1;
        }
        c = 0;
        z = 0;
        x = 0;
        while (x < length) {
            String[] wordAsArrayhiddenAsWord = wordAsArrayHidden[z].split("");
            if (wordAsArrayhiddenAsWord[0].equals("h")) {
                wordAsArrayHiddenH[c] = wordAsArrayHidden[z];
                c = c + 1;
            }
            z = z + 1;
            x = x + 1;
        }
        c = 0;
        z = 0;
        x = 0;
        while (x < length) {
            String[] wordAsArrayhiddenAsWord = wordAsArrayHidden[z].split("");
            if (wordAsArrayhiddenAsWord[0].equals("i")) {
                wordAsArrayHiddenI[c] = wordAsArrayHidden[z];
                c = c + 1;
            }
            z = z + 1;
            x = x + 1;
        }
        c = 0;
        z = 0;
        x = 0;
        while (x < length) {
            String[] wordAsArrayhiddenAsWord = wordAsArrayHidden[z].split("");
            if (wordAsArrayhiddenAsWord[0].equals("j")) {
                wordAsArrayHiddenJ[c] = wordAsArrayHidden[z];
                c = c + 1;
            }
            z = z + 1;
            x = x + 1;
        }
        c = 0;
        z = 0;
        x = 0;
        while (x < length) {
            String[] wordAsArrayhiddenAsWord = wordAsArrayHidden[z].split("");
            if (wordAsArrayhiddenAsWord[0].equals("k")) {
                wordAsArrayHiddenK[c] = wordAsArrayHidden[z];
                c = c + 1;
            }
            z = z + 1;
            x = x + 1;
        }
        c = 0;
        z = 0;
        x = 0;
        while (x < length) {
            String[] wordAsArrayhiddenAsWord = wordAsArrayHidden[z].split("");
            if (wordAsArrayhiddenAsWord[0].equals("l")) {
                wordAsArrayHiddenL[c] = wordAsArrayHidden[z];
                c = c + 1;
            }
            z = z + 1;
            x = x + 1;
        }
        c = 0;
        z = 0;
        x = 0;
        while (x < length) {
            String[] wordAsArrayhiddenAsWord = wordAsArrayHidden[z].split("");
            if (wordAsArrayhiddenAsWord[0].equals("m")) {
                wordAsArrayHiddenM[c] = wordAsArrayHidden[z];
                c = c + 1;
            }
            z = z + 1;
            x = x + 1;
        }
        c = 0;
        z = 0;
        x = 0;
        while (x < length) {
            String[] wordAsArrayhiddenAsWord = wordAsArrayHidden[z].split("");
            if (wordAsArrayhiddenAsWord[0].equals("n")) {
                wordAsArrayHiddenN[c] = wordAsArrayHidden[z];
                c = c + 1;
            }
            z = z + 1;
            x = x + 1;
        }
        c = 0;
        z = 0;
        x = 0;
        while (x < length) {
            String[] wordAsArrayhiddenAsWord = wordAsArrayHidden[z].split("");
            if (wordAsArrayhiddenAsWord[0].equals("o")) {
                wordAsArrayHiddenO[c] = wordAsArrayHidden[z];
                c = c + 1;
            }
            z = z + 1;
            x = x + 1;
        }
        c = 0;
        z = 0;
        x = 0;
        while (x < length) {
            String[] wordAsArrayhiddenAsWord = wordAsArrayHidden[z].split("");
            if (wordAsArrayhiddenAsWord[0].equals("p")) {
                wordAsArrayHiddenP[c] = wordAsArrayHidden[z];
                c = c + 1;
            }
            z = z + 1;
            x = x + 1;
        }
        c = 0;
        z = 0;
        x = 0;
        while (x < length) {
            String[] wordAsArrayhiddenAsWord = wordAsArrayHidden[z].split("");
            if (wordAsArrayhiddenAsWord[0].equals("q")) {
                wordAsArrayHiddenQ[c] = wordAsArrayHidden[z];
                c = c + 1;
            }
            z = z + 1;
            x = x + 1;
        }
        c = 0;
        z = 0;
        x = 0;
        while (x < length) {
            String[] wordAsArrayhiddenAsWord = wordAsArrayHidden[z].split("");
            if (wordAsArrayhiddenAsWord[0].equals("r")) {
                wordAsArrayHiddenR[c] = wordAsArrayHidden[z];
                c = c + 1;
            }
            z = z + 1;
            x = x + 1;
        }
        c = 0;
        z = 0;
        x = 0;
        while (x < length) {
            String[] wordAsArrayhiddenAsWord = wordAsArrayHidden[z].split("");
            if (wordAsArrayhiddenAsWord[0].equals("s")) {
                wordAsArrayHiddenS[c] = wordList[z];
                c = c + 1;
            }
            z = z + 1;
            x = x + 1;
        }
        c = 0;
        z = 0;
        x = 0;
        while (x < length) {
            String[] wordAsArrayhiddenAsWord = wordAsArrayHidden[z].split("");
            if (wordAsArrayhiddenAsWord[0].equals("t")) {
                wordAsArrayHiddenT[c] = wordAsArrayHidden[z];
                c = c + 1;
            }
            z = z + 1;
            x = x + 1;
        }
        c = 0;
        z = 0;
        x = 0;
        while (x < length) {
            String[] wordAsArrayhiddenAsWord = wordAsArrayHidden[z].split("");
            if (wordAsArrayhiddenAsWord[0].equals("u")) {
                wordAsArrayHiddenU[c] = wordAsArrayHidden[z];
                c = c + 1;
            }
            z = z + 1;
            x = x + 1;
        }
        c = 0;
        z = 0;
        x = 0;
        while (x < length) {
            String[] wordAsArrayhiddenAsWord = wordAsArrayHidden[z].split("");
            if (wordAsArrayhiddenAsWord[0].equals("v")) {
                wordAsArrayHiddenV[c] = wordAsArrayHidden[z];
                c = c + 1;
            }
            z = z + 1;
            x = x + 1;
        }
        c = 0;
        z = 0;
        x = 0;
        while (x < length) {
            String[] wordAsArrayhiddenAsWord = wordAsArrayHidden[z].split("");
            if (wordAsArrayhiddenAsWord[0].equals("w")) {
                wordAsArrayHiddenW[c] = wordAsArrayHidden[z];
                c = c + 1;
            }
            z = z + 1;
            x = x + 1;
        }
        c = 0;
        z = 0;
        x = 0;
        while (x < length) {
            String[] wordAsArrayhiddenAsWord = wordAsArrayHidden[z].split("");
            if (wordAsArrayhiddenAsWord[0].equals("x")) {
                wordAsArrayHiddenX[c] = wordAsArrayHidden[z];
                c = c + 1;
            }
            z = z + 1;
            x = x + 1;
        }
        c = 0;
        z = 0;
        x = 0;
        while (x < length) {
            String[] wordAsArrayhiddenAsWord = wordAsArrayHidden[z].split("");
            if (wordAsArrayhiddenAsWord[0].equals("y")) {
                wordAsArrayHiddenY[c] = wordAsArrayHidden[z];
                c = c + 1;
            }
            z = z + 1;
            x = x + 1;
        }
        c = 0;
        z = 0;
        x = 0;
        while (x < length) {
            String[] wordAsArrayhiddenAsWord = wordAsArrayHidden[z].split("");
            if (wordAsArrayhiddenAsWord[0].equals("z")) {
                wordAsArrayHiddenZ[c] = wordAsArrayHidden[z];
                c = c + 1;
            }
            z = z + 1;
            x = x + 1;
        }

        String[] ArrayAsArrayHiddenA = new String[wordList.length];
        String[] ArrayAsArrayHiddenB = new String[wordList.length];
        String[] ArrayAsArrayHiddenC = new String[wordList.length];
        String[] ArrayAsArrayHiddenD = new String[wordList.length];
        String[] ArrayAsArrayHiddenE = new String[wordList.length];
        String[] ArrayAsArrayHiddenF = new String[wordList.length];
        String[] ArrayAsArrayHiddenG = new String[wordList.length];
        String[] ArrayAsArrayHiddenH = new String[wordList.length];
        String[] ArrayAsArrayHiddenI = new String[wordList.length];
        String[] ArrayAsArrayHiddenJ = new String[wordList.length];
        String[] ArrayAsArrayHiddenK = new String[wordList.length];
        String[] ArrayAsArrayHiddenL = new String[wordList.length];
        String[] ArrayAsArrayHiddenM = new String[wordList.length];
        String[] ArrayAsArrayHiddenN = new String[wordList.length];
        String[] ArrayAsArrayHiddenO = new String[wordList.length];
        String[] ArrayAsArrayHiddenP = new String[wordList.length];
        String[] ArrayAsArrayHiddenQ = new String[wordList.length];
        String[] ArrayAsArrayHiddenR = new String[wordList.length];
        String[] ArrayAsArrayHiddenS = new String[wordList.length];
        String[] ArrayAsArrayHiddenT = new String[wordList.length];
        String[] ArrayAsArrayHiddenU = new String[wordList.length];
        String[] ArrayAsArrayHiddenV = new String[wordList.length];
        String[] ArrayAsArrayHiddenW = new String[wordList.length];
        String[] ArrayAsArrayHiddenX = new String[wordList.length];
        String[] ArrayAsArrayHiddenY = new String[wordList.length];
        String[] ArrayAsArrayHiddenZ = new String[wordList.length];

        x = 0;
        z = 0;
        c = 0;
        k = 0;
        i = 0;
        while (i < 30) {
            while (x < length) {
                if ((wordAsArrayHiddenA[z] == null)) {
                    x = x + 1;
                }
                if ((wordAsArrayHiddenA[z] != null)) {
                    String[] wordAsArray = wordAsArrayHiddenA[z].split("");
                    if (wordAsArray[1].equals(alphabetAsArray[k])) {
                        ArrayAsArrayHiddenA[c] = wordAsArrayHiddenA[z];
                        c = c + 1;
                    }
                    z = z + 1;
                    x = x + 1;
                }
            }
            z = 0;
            x = 0;
            k = k + 1;
            i = i + 1;
        }
        x = 0;
        z = 0;
        c = 0;
        k = 0;
        i = 0;
        while (i < 30) {
            while (x < length) {
                if ((wordAsArrayHiddenB[z] == null)) {
                    x = x + 1;
                }
                if ((wordAsArrayHiddenB[z] != null)) {
                    String[] wordAsArray = wordAsArrayHiddenB[z].split("");
                    if (wordAsArray[1].equals(alphabetAsArray[k])) {
                        ArrayAsArrayHiddenB[c] = wordAsArrayHiddenB[z];
                        c = c + 1;
                    }
                    z = z + 1;
                    x = x + 1;
                }
            }
            z = 0;
            x = 0;
            k = k + 1;
            i = i + 1;
        }
        x = 0;
        z = 0;
        c = 0;
        k = 0;
        i = 0;
        while (i < 30) {
            while (x < length) {
                if ((wordAsArrayHiddenC[z] == null)) {
                    x = x + 1;
                }
                if ((wordAsArrayHiddenC[z] != null)) {
                    String[] wordAsArray = wordAsArrayHiddenC[z].split("");
                    if (wordAsArray[1].equals(alphabetAsArray[k])) {
                        ArrayAsArrayHiddenC[c] = wordAsArrayHiddenC[z];
                        c = c + 1;
                    }
                    z = z + 1;
                    x = x + 1;
                }
            }
            z = 0;
            x = 0;
            k = k + 1;
            i = i + 1;
        }
        x = 0;
        z = 0;
        c = 0;
        k = 0;
        i = 0;
        while (i < 30) {
            while (x < length) {
                if ((wordAsArrayHiddenD[z] == null)) {
                    x = x + 1;
                }
                if ((wordAsArrayHiddenD[z] != null)) {
                    String[] wordAsArray = wordAsArrayHiddenD[z].split("");
                    if (wordAsArray[1].equals(alphabetAsArray[k])) {
                        ArrayAsArrayHiddenD[c] = wordAsArrayHiddenD[z];
                        c = c + 1;
                    }
                    z = z + 1;
                    x = x + 1;
                }
            }
            z = 0;
            x = 0;
            k = k + 1;
            i = i + 1;
        }
        x = 0;
        z = 0;
        c = 0;
        k = 0;
        i = 0;
        while (i < 30) {
            while (x < length) {
                if ((wordAsArrayHiddenE[z] == null)) {
                    x = x + 1;
                }
                if ((wordAsArrayHiddenE[z] != null)) {
                    String[] wordAsArray = wordAsArrayHiddenE[z].split("");
                    if (wordAsArray[1].equals(alphabetAsArray[k])) {
                        ArrayAsArrayHiddenE[c] = wordAsArrayHiddenE[z];
                        c = c + 1;
                    }
                    z = z + 1;
                    x = x + 1;
                }
            }
            z = 0;
            x = 0;
            k = k + 1;
            i = i + 1;
        }
        x = 0;
        z = 0;
        c = 0;
        k = 0;
        i = 0;
        while (i < 30) {
            while (x < length) {
                if ((wordAsArrayHiddenF[z] == null)) {
                    x = x + 1;
                }
                if ((wordAsArrayHiddenF[z] != null)) {
                    String[] wordAsArray = wordAsArrayHiddenF[z].split("");
                    if (wordAsArray[1].equals(alphabetAsArray[k])) {
                        ArrayAsArrayHiddenF[c] = wordAsArrayHiddenF[z];
                        c = c + 1;
                    }
                    z = z + 1;
                    x = x + 1;
                }
            }
            z = 0;
            x = 0;
            k = k + 1;
            i = i + 1;
        }
        x = 0;
        z = 0;
        c = 0;
        k = 0;
        i = 0;
        while (i < 30) {
            while (x < length) {
                if ((wordAsArrayHiddenG[z] == null)) {
                    x = x + 1;
                }
                if ((wordAsArrayHiddenG[z] != null)) {
                    String[] wordAsArray = wordAsArrayHiddenG[z].split("");
                    if (wordAsArray[1].equals(alphabetAsArray[k])) {
                        ArrayAsArrayHiddenG[c] = wordAsArrayHiddenG[z];
                        c = c + 1;
                    }
                    z = z + 1;
                    x = x + 1;
                }
            }
            z = 0;
            x = 0;
            k = k + 1;
            i = i + 1;
        }
        x = 0;
        z = 0;
        c = 0;
        k = 0;
        i = 0;
        while (i < 30) {
            while (x < length) {
                if ((wordAsArrayHiddenH[z] == null)) {
                    x = x + 1;
                }
                if ((wordAsArrayHiddenH[z] != null)) {
                    String[] wordAsArray = wordAsArrayHiddenH[z].split("");
                    if (wordAsArray[1].equals(alphabetAsArray[k])) {
                        ArrayAsArrayHiddenH[c] = wordAsArrayHiddenH[z];
                        c = c + 1;
                    }
                    z = z + 1;
                    x = x + 1;
                }
            }
            z = 0;
            x = 0;
            k = k + 1;
            i = i + 1;
        }
        x = 0;
        z = 0;
        c = 0;
        k = 0;
        i = 0;
        while (i < 30) {
            while (x < length) {
                if ((wordAsArrayHiddenI[z] == null)) {
                    x = x + 1;
                }
                if ((wordAsArrayHiddenI[z] != null)) {
                    String[] wordAsArray = wordAsArrayHiddenI[z].split("");
                    if (wordAsArray[1].equals(alphabetAsArray[k])) {
                        ArrayAsArrayHiddenI[c] = wordAsArrayHiddenI[z];
                        c = c + 1;
                    }
                    z = z + 1;
                    x = x + 1;
                }
            }
            z = 0;
            x = 0;
            k = k + 1;
            i = i + 1;
        }
        x = 0;
        z = 0;
        c = 0;
        k = 0;
        i = 0;
        while (i < 30) {
            while (x < length) {
                if ((wordAsArrayHiddenJ[z] == null)) {
                    x = x + 1;
                }
                if ((wordAsArrayHiddenJ[z] != null)) {
                    String[] wordAsArray = wordAsArrayHiddenJ[z].split("");
                    if (wordAsArray[1].equals(alphabetAsArray[k])) {
                        ArrayAsArrayHiddenJ[c] = wordAsArrayHiddenJ[z];
                        c = c + 1;
                    }
                    z = z + 1;
                    x = x + 1;
                }
            }
            z = 0;
            x = 0;
            k = k + 1;
            i = i + 1;
        }
        x = 0;
        z = 0;
        c = 0;
        k = 0;
        i = 0;
        while (i < 30) {
            while (x < length) {
                if ((wordAsArrayHiddenK[z] == null)) {
                    x = x + 1;
                }
                if ((wordAsArrayHiddenK[z] != null)) {
                    String[] wordAsArray = wordAsArrayHiddenK[z].split("");
                    if (wordAsArray[1].equals(alphabetAsArray[k])) {
                        ArrayAsArrayHiddenK[c] = wordAsArrayHiddenK[z];
                        c = c + 1;
                    }
                    z = z + 1;
                    x = x + 1;
                }
            }
            z = 0;
            x = 0;
            k = k + 1;
            i = i + 1;
        }
        x = 0;
        z = 0;
        c = 0;
        k = 0;
        i = 0;
        while (i < 30) {
            while (x < length) {
                if ((wordAsArrayHiddenL[z] == null)) {
                    x = x + 1;
                }
                if ((wordAsArrayHiddenL[z] != null)) {
                    String[] wordAsArray = wordAsArrayHiddenL[z].split("");
                    if (wordAsArray[1].equals(alphabetAsArray[k])) {
                        ArrayAsArrayHiddenL[c] = wordAsArrayHiddenL[z];
                        c = c + 1;
                    }
                    z = z + 1;
                    x = x + 1;
                }
            }
            z = 0;
            x = 0;
            k = k + 1;
            i = i + 1;
        }
        x = 0;
        z = 0;
        c = 0;
        k = 0;
        i = 0;
        while (i < 30) {
            while (x < length) {
                if ((wordAsArrayHiddenM[z] == null)) {
                    x = x + 1;
                }
                if ((wordAsArrayHiddenM[z] != null)) {
                    String[] wordAsArray = wordAsArrayHiddenM[z].split("");
                    if (wordAsArray[1].equals(alphabetAsArray[k])) {
                        ArrayAsArrayHiddenM[c] = wordAsArrayHiddenM[z];
                        c = c + 1;
                    }
                    z = z + 1;
                    x = x + 1;
                }
            }
            z = 0;
            x = 0;
            k = k + 1;
            i = i + 1;
        }
        x = 0;
        z = 0;
        c = 0;
        k = 0;
        i = 0;
        while (i < 30) {
            while (x < length) {
                if ((wordAsArrayHiddenN[z] == null)) {
                    x = x + 1;
                }
                if ((wordAsArrayHiddenN[z] != null)) {
                    String[] wordAsArray = wordAsArrayHiddenN[z].split("");
                    if (wordAsArray[1].equals(alphabetAsArray[k])) {
                        ArrayAsArrayHiddenN[c] = wordAsArrayHiddenN[z];
                        c = c + 1;
                    }
                    z = z + 1;
                    x = x + 1;
                }
            }
            z = 0;
            x = 0;
            k = k + 1;
            i = i + 1;
        }
        x = 0;
        z = 0;
        c = 0;
        k = 0;
        i = 0;
        while (i < 30) {
            while (x < length) {
                if ((wordAsArrayHiddenO[z] == null)) {
                    x = x + 1;
                }
                if ((wordAsArrayHiddenO[z] != null)) {
                    String[] wordAsArray = wordAsArrayHiddenO[z].split("");
                    if (wordAsArray[1].equals(alphabetAsArray[k])) {
                        ArrayAsArrayHiddenO[c] = wordAsArrayHiddenO[z];
                        c = c + 1;
                    }
                    z = z + 1;
                    x = x + 1;
                }
            }
            z = 0;
            x = 0;
            k = k + 1;
            i = i + 1;
        }
        x = 0;
        z = 0;
        c = 0;
        k = 0;
        i = 0;
        while (i < 30) {
            while (x < length) {
                if ((wordAsArrayHiddenP[z] == null)) {
                    x = x + 1;
                }
                if ((wordAsArrayHiddenP[z] != null)) {
                    String[] wordAsArray = wordAsArrayHiddenP[z].split("");
                    if (wordAsArray[1].equals(alphabetAsArray[k])) {
                        ArrayAsArrayHiddenP[c] = wordAsArrayHiddenP[z];
                        c = c + 1;
                    }
                    z = z + 1;
                    x = x + 1;
                }
            }
            z = 0;
            x = 0;
            k = k + 1;
            i = i + 1;
        }
        x = 0;
        z = 0;
        c = 0;
        k = 0;
        i = 0;
        while (i < 30) {
            while (x < length) {
                if ((wordAsArrayHiddenQ[z] == null)) {
                    x = x + 1;
                }
                if ((wordAsArrayHiddenQ[z] != null)) {
                    String[] wordAsArray = wordAsArrayHiddenQ[z].split("");
                    if (wordAsArray[1].equals(alphabetAsArray[k])) {
                        ArrayAsArrayHiddenQ[c] = wordAsArrayHiddenQ[z];
                        c = c + 1;
                    }
                    z = z + 1;
                    x = x + 1;
                }
            }
            z = 0;
            x = 0;
            k = k + 1;
            i = i + 1;
        }
        x = 0;
        z = 0;
        c = 0;
        k = 0;
        i = 0;
        while (i < 30) {
            while (x < length) {
                if ((wordAsArrayHiddenR[z] == null)) {
                    x = x + 1;
                }
                if ((wordAsArrayHiddenR[z] != null)) {
                    String[] wordAsArray = wordAsArrayHiddenR[z].split("");
                    if (wordAsArray[1].equals(alphabetAsArray[k])) {
                        ArrayAsArrayHiddenR[c] = wordAsArrayHiddenR[z];
                        c = c + 1;
                    }
                    z = z + 1;
                    x = x + 1;
                }
            }
            z = 0;
            x = 0;
            k = k + 1;
            i = i + 1;
        }
        x = 0;
        z = 0;
        c = 0;
        k = 0;
        i = 0;
        while (i < 30) {
            while (x < length) {
                if ((wordAsArrayHiddenS[z] == null)) {
                    x = x + 1;
                }
                if ((wordAsArrayHiddenS[z] != null)) {
                    String[] wordAsArray = wordAsArrayHiddenS[z].split("");
                    if (wordAsArray[1].equals(alphabetAsArray[k])) {
                        ArrayAsArrayHiddenS[c] = wordAsArrayHiddenS[z];
                        c = c + 1;
                    }
                    z = z + 1;
                    x = x + 1;
                }
            }
            z = 0;
            x = 0;
            k = k + 1;
            i = i + 1;
        }
        x = 0;
        z = 0;
        c = 0;
        k = 0;
        i = 0;
        while (i < 30) {
            while (x < length) {
                if ((wordAsArrayHiddenT[z] == null)) {
                    x = x + 1;
                }
                if ((wordAsArrayHiddenT[z] != null)) {
                    String[] wordAsArray = wordAsArrayHiddenT[z].split("");
                    if (wordAsArray[1].equals(alphabetAsArray[k])) {
                        ArrayAsArrayHiddenT[c] = wordAsArrayHiddenT[z];
                        c = c + 1;
                    }
                    z = z + 1;
                    x = x + 1;
                }
            }
            z = 0;
            x = 0;
            k = k + 1;
            i = i + 1;
        }
        x = 0;
        z = 0;
        c = 0;
        k = 0;
        i = 0;
        while (i < 30) {
            while (x < length) {
                if ((wordAsArrayHiddenU[z] == null)) {
                    x = x + 1;
                }
                if ((wordAsArrayHiddenU[z] != null)) {
                    String[] wordAsArray = wordAsArrayHiddenU[z].split("");
                    if (wordAsArray[1].equals(alphabetAsArray[k])) {
                        ArrayAsArrayHiddenU[c] = wordAsArrayHiddenU[z];
                        c = c + 1;
                    }
                    z = z + 1;
                    x = x + 1;
                }
            }
            z = 0;
            x = 0;
            k = k + 1;
            i = i + 1;
        }
        x = 0;
        z = 0;
        c = 0;
        k = 0;
        i = 0;
        while (i < 30) {
            while (x < length) {
                if ((wordAsArrayHiddenV[z] == null)) {
                    x = x + 1;
                }
                if ((wordAsArrayHiddenV[z] != null)) {
                    String[] wordAsArray = wordAsArrayHiddenV[z].split("");
                    if (wordAsArray[1].equals(alphabetAsArray[k])) {
                        ArrayAsArrayHiddenV[c] = wordAsArrayHiddenV[z];
                        c = c + 1;
                    }
                    z = z + 1;
                    x = x + 1;
                }
            }
            z = 0;
            x = 0;
            k = k + 1;
            i = i + 1;
        }
        x = 0;
        z = 0;
        c = 0;
        k = 0;
        i = 0;
        while (i < 30) {
            while (x < length) {
                if ((wordAsArrayHiddenW[z] == null)) {
                    x = x + 1;
                }
                if ((wordAsArrayHiddenW[z] != null)) {
                    String[] wordAsArray = wordAsArrayHiddenW[z].split("");
                    if (wordAsArray[1].equals(alphabetAsArray[k])) {
                        ArrayAsArrayHiddenW[c] = wordAsArrayHiddenW[z];
                        c = c + 1;
                    }
                    z = z + 1;
                    x = x + 1;
                }
            }
            z = 0;
            x = 0;
            k = k + 1;
            i = i + 1;
        }
        x = 0;
        z = 0;
        c = 0;
        k = 0;
        i = 0;
        while (i < 30) {
            while (x < length) {
                if ((wordAsArrayHiddenX[z] == null)) {
                    x = x + 1;
                }
                if ((wordAsArrayHiddenX[z] != null)) {
                    String[] wordAsArray = wordAsArrayHiddenX[z].split("");
                    if (wordAsArray[1].equals(alphabetAsArray[k])) {
                        ArrayAsArrayHiddenX[c] = wordAsArrayHiddenX[z];
                        c = c + 1;
                    }
                    z = z + 1;
                    x = x + 1;
                }
            }
            z = 0;
            x = 0;
            k = k + 1;
            i = i + 1;
        }
        x = 0;
        z = 0;
        c = 0;
        k = 0;
        i = 0;
        while (i < 30) {
            while (x < length) {
                if ((wordAsArrayHiddenY[z] == null)) {
                    x = x + 1;
                }
                if ((wordAsArrayHiddenY[z] != null)) {
                    String[] wordAsArray = wordAsArrayHiddenY[z].split("");
                    if (wordAsArray[1].equals(alphabetAsArray[k])) {
                        ArrayAsArrayHiddenY[c] = wordAsArrayHiddenY[z];
                        c = c + 1;
                    }
                    z = z + 1;
                    x = x + 1;
                }
            }
            z = 0;
            x = 0;
            k = k + 1;
            i = i + 1;
        }
        x = 0;
        z = 0;
        c = 0;
        k = 0;
        i = 0;
        while (i < 30) {
            while (x < length) {
                if ((wordAsArrayHiddenZ[z] == null)) {
                    x = x + 1;
                }
                if ((wordAsArrayHiddenZ[z] != null)) {
                    String[] wordAsArray = wordAsArrayHiddenZ[z].split("");
                    if (wordAsArray[1].equals(alphabetAsArray[k])) {
                        ArrayAsArrayHiddenZ[c] = wordAsArrayHiddenZ[z];
                        c = c + 1;
                    }
                    z = z + 1;
                    x = x + 1;
                }
            }
            z = 0;
            x = 0;
            k = k + 1;
            i = i + 1;
        }
        int t = 0;
        while (t < length) {
            if (ArrayAsArrayHiddenA[t] != null) {
                System.out.println(ArrayAsArrayHiddenA[t]);
            }
            t = t + 1;
        }
        t = 0;
        while (t < length) {
            if (ArrayAsArrayHiddenB[t] != null) {
                System.out.println(ArrayAsArrayHiddenB[t]);
            }
            t = t + 1;
        }
        t = 0;
        while (t < length) {
            if (ArrayAsArrayHiddenC[t] != null) {
                System.out.println(ArrayAsArrayHiddenC[t]);
            }
            t = t + 1;
        }
        t = 0;
        while (t < length) {
            if (ArrayAsArrayHiddenD[t] != null) {
                System.out.println(ArrayAsArrayHiddenD[t]);
            }
            t = t + 1;
        }
        t = 0;
        while (t < length) {
            if (ArrayAsArrayHiddenE[t] != null) {
                System.out.println(ArrayAsArrayHiddenE[t]);
            }
            t = t + 1;
        }
        t = 0;
        while (t < length) {
            if (ArrayAsArrayHiddenF[t] != null) {
                System.out.println(ArrayAsArrayHiddenF[t]);
            }
            t = t + 1;
        }
        t = 0;
        while (t < length) {
            if (ArrayAsArrayHiddenG[t] != null) {
                System.out.println(ArrayAsArrayHiddenG[t]);
            }
            t = t + 1;
        }
        t = 0;
        while (t < length) {
            if (ArrayAsArrayHiddenH[t] != null) {
                System.out.println(ArrayAsArrayHiddenH[t]);
            }
            t = t + 1;
        }
        t = 0;
        while (t < length) {
            if (ArrayAsArrayHiddenI[t] != null) {
                System.out.println(ArrayAsArrayHiddenI[t]);
            }
            t = t + 1;
        }
        t = 0;
        while (t < length) {
            if (ArrayAsArrayHiddenJ[t] != null) {
                System.out.println(ArrayAsArrayHiddenJ[t]);
            }
            t = t + 1;
        }
        t = 0;
        while (t < length) {
            if (ArrayAsArrayHiddenK[t] != null) {
                System.out.println(ArrayAsArrayHiddenK[t]);
            }
            t = t + 1;
        }
        t = 0;
        while (t < length) {
            if (ArrayAsArrayHiddenL[t] != null) {
                System.out.println(ArrayAsArrayHiddenL[t]);
            }
            t = t + 1;
        }
        t = 0;
        while (t < length) {
            if (ArrayAsArrayHiddenM[t] != null) {
                System.out.println(ArrayAsArrayHiddenM[t]);
            }
            t = t + 1;
        }
        t = 0;
        while (t < length) {
            if (ArrayAsArrayHiddenN[t] != null) {
                System.out.println(ArrayAsArrayHiddenN[t]);
            }
            t = t + 1;
        }
        t = 0;
        while (t < length) {
            if (ArrayAsArrayHiddenO[t] != null) {
                System.out.println(ArrayAsArrayHiddenO[t]);
            }
            t = t + 1;
        }
        t = 0;
        while (t < length) {
            if (ArrayAsArrayHiddenP[t] != null) {
                System.out.println(ArrayAsArrayHiddenP[t]);
            }
            t = t + 1;
        }
        t = 0;
        while (t < length) {
            if (ArrayAsArrayHiddenQ[t] != null) {
                System.out.println(ArrayAsArrayHiddenQ[t]);
            }
            t = t + 1;
        }
        t = 0;
        while (t < length) {
            if (ArrayAsArrayHiddenR[t] != null) {
                System.out.println(ArrayAsArrayHiddenR[t]);
            }
            t = t + 1;
        }
        t = 0;
        while (t < length) {
            if (ArrayAsArrayHiddenS[t] != null) {
                System.out.println(ArrayAsArrayHiddenS[t]);
            }
            t = t + 1;
        }
        t = 0;
        while (t < length) {
            if (ArrayAsArrayHiddenT[t] != null) {
                System.out.println(ArrayAsArrayHiddenT[t]);
            }
            t = t + 1;
        }
        t = 0;
        while (t < length) {
            if (ArrayAsArrayHiddenU[t] != null) {
                System.out.println(ArrayAsArrayHiddenU[t]);
            }
            t = t + 1;
        }
        t = 0;
        while (t < length) {
            if (ArrayAsArrayHiddenV[t] != null) {
                System.out.println(ArrayAsArrayHiddenV[t]);
            }
            t = t + 1;
        }
        t = 0;
        while (t < length) {
            if (ArrayAsArrayHiddenW[t] != null) {
                System.out.println(ArrayAsArrayHiddenW[t]);
            }
            t = t + 1;
        }
        t = 0;
        while (t < length) {
            if (ArrayAsArrayHiddenX[t] != null) {
                System.out.println(ArrayAsArrayHiddenX[t]);
            }
            t = t + 1;
        }
        t = 0;
        while (t < length) {
            if (ArrayAsArrayHiddenY[t] != null) {
                System.out.println(ArrayAsArrayHiddenY[t]);
            }
            t = t + 1;
        }
        t = 0;
        while (t < length) {
            if (ArrayAsArrayHiddenZ[t] != null) {
                System.out.println(ArrayAsArrayHiddenZ[t]);
            }
            t = t + 1;
        }
    }
}
