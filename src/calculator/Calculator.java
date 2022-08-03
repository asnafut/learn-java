package calculator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) {
        // String[] operations = {}
        System.out.println("choose the operation");
        System.out.println("1: addition");
        System.out.println("2: subtraction");
        System.out.println("3: multiplication");
        System.out.println("4: division");
        // read variable
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String operation;
        try {
            operation = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        int operationIndex = Integer.parseInt(operation);

        if (operationIndex == 1) {
            System.out.println("choose value1");
            // read variable
            String value1AsString;
            try {
                value1AsString = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
            int value1 = Integer.parseInt(value1AsString);

            System.out.println("choose value2");
            // read variable
            String value2AsString;
            try {
                value2AsString = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
            int value2 = Integer.parseInt(value2AsString);

            int x = value1 + value2;

            System.out.println(x);
        } else if (operationIndex == 2) {
            System.out.println("choose value1");
            // read variable
            String value1AsString;
            try {
                value1AsString = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
            int value1 = Integer.parseInt(value1AsString);

            System.out.println("choose value2");
            // read variable
            String value2AsString;
            try {
                value2AsString = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
            int value2 = Integer.parseInt(value2AsString);

            int x = value1 - value2;

            System.out.println(x);
        }else if (operationIndex == 3) {
            System.out.println("choose value1");
            // read variable
            String value1AsString;
            try {
                value1AsString = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
            int value1 = Integer.parseInt(value1AsString);

            System.out.println("choose value2");
            // read variable
            String value2AsString;
            try {
                value2AsString = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
            int value2 = Integer.parseInt(value2AsString);

            int x = value1 * value2;

            System.out.println(x);
        } else if (operationIndex == 4) {
            System.out.println("choose value1");
            // read variable
            String value1AsString;
            try {
                value1AsString = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
            int value1 = Integer.parseInt(value1AsString);

            System.out.println("choose value2");
            // read variable
            String value2AsString;
            try {
                value2AsString = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
            int value2 = Integer.parseInt(value2AsString);

            int x = value1 / value2;

            System.out.println(x);
        }
    }

    public static int add(int value1, int value2) {
        return value1 + value2;
    }

    public static int minus(int value1, int value2) {
        return value1 - value2;
    }

    public static int multiply(int value1, int value2) {
        return value1 * value2;
    }

    public static int divide(int value1, int value2) {
        return value1 / value2;
    }

}
