package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumbers {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("choose the maximal number");

        String operation;
        try {
            operation = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        int maxNumber = Integer.parseInt(operation);

        // Empty String
        String primeNumbers = "";

        for (int i= 1; i <= maxNumber; i++) {
            int counter = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                // Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to " + maxNumber + " are :");
        System.out.println(primeNumbers);
    }
}