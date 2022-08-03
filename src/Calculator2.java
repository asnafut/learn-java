import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class Calculator2 {
    public static void main(String[] args) {
        // String[] operations = {}
        System.out.println("choose the operation");
        System.out.println("1: addition");
        System.out.println("2: subtraction");
        System.out.println("3: multiplication");
        System.out.println("4: division");
        System.out.println("5: square");
        System.out.println("6: square root");
        System.out.println("7: cube root");
        System.out.println("8: n root");
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
            x = add(value1, value2);
        } else if (operationIndex == 2) {
            x = minus(value1, value2);
        } else if (operationIndex == 3) {
            x = multiply(value1, value2);
        } else if (operationIndex == 4) {
            x = divide(value1, value2);
        } else if (operationIndex == 5) {
            x = power2(value1, value2);
        } else if (operationIndex == 6) {
            x = sqrt(value1);
        } else if (operationIndex == 7) {
            x = cbrt(value1);
        } else if (operationIndex == 8) {
            x = nRoot(value1, value2);
        }
        System.out.println(x);
    }

    // calculate and return
    public static int add(int stuff1, int stuff2) {
        System.out.println("it is addition");
        return stuff1 + stuff2;
    }

    public static int minus(int stuff1, int stuff2) {
        System.out.println("it is subtraction");
        return stuff1 - stuff2;
    }

    public static int multiply(int stuff1, int stuff2) {
        System.out.println("it is multiplication");
        return stuff1 * stuff2;
    }

    public static int divide(int stuff1, int stuff2) {
        System.out.println("it is division");
        return stuff1 / stuff2;
    }

    public static int power(int stuff1, int stuff2) {
        if (stuff2 == 0) {
            return 1;
        }
        int intermediateResult = stuff1;
        int i = 1;
        while (i < stuff2) {
            intermediateResult = stuff1 * intermediateResult;
            i++;
        }
        return intermediateResult;
    }

    public static int power2(int stuff1, int stuff2) {
        double result = Math.pow(stuff1, stuff2);
        return (int)Math.round(result);
    }

    public static int sqrt(int stuff1) {
        double result = Math.sqrt(stuff1);
        return (int)Math.round(result);
    }

    public static int cbrt(int stuff1) {
        double result = Math.cbrt(stuff1);
        return (int)Math.round(result);
    }

    public static int nRoot(int stuff1, int stuff2) {
        double result = Math.pow(stuff1, 1.0 / stuff2);
        return (int)Math.round(result);
    }

}
