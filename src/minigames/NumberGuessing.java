package minigames;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberGuessing {
    public static void main(String[] args) {
        System.out.println("choose a number");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String value1AsString;
        try {
            value1AsString = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        int n = Integer.parseInt(value1AsString);

        int randomNumber = (int) Math.floor(Math.random() * (n + 1));

        System.out.println("guess the number");

        int i;
        do {
            String value2AsString;
            try {
                value2AsString = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
            i = Integer.parseInt(value2AsString);
            if (i > randomNumber) {
                System.out.println("lower");
            } else if (i < randomNumber) {
                System.out.println("higher");
            } else if (i == randomNumber) {
                System.out.println("correct");
            }
        } while (i != randomNumber);
    }
}