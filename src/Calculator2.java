import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator2 {
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

        int x = 0;
        if (operationIndex == 1) {
            x = add( value1, value2);
        } else if (operationIndex == 2) {
            x = minus( value1, value2);
        } else if (operationIndex == 3) {
            x = multiply( value1, value2);
        } else if (operationIndex == 4) {
            x = divide( value1, value2);
        }

        System.out.println(x);
    }
    //calculate and return
    public static int add(int stuff1, int stuff2) {
        System.out.println("it is addition");
        return stuff1 + stuff2;
    }

    public static int minus(int stuff1, int stuff2) {
        return stuff1 - stuff2;
    }

    public static int multiply(int stuff1, int stuff2) {
        return stuff1 * stuff2;
    }

    public static int divide(int stuff1, int stuff2) {
        return stuff1 / stuff2;
    }

}
