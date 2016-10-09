package operators;

public class OperatorsExamples {
    public static void main(String[] args) {
        // Assignment Operator

        System.out.println("Assignment Operator");
        System.out.println("=================================\n");

        int number = 2;
        System.out.println("number = 2: " + number);

        // Arithmetic Operators

        System.out.println("\nArithmetic Operators");
        System.out.println("=================================\n");

        System.out.println("1 + 2 = " + (1 + 2)); // also used for string concatenation
        System.out.println("1 - 2 = " + (1 - 2));
        System.out.println("1 * 2 = " + (1 * 2));
        System.out.println("1 / 2 = " + (1 / 2));
        System.out.println("1 % 2 = " + (1 % 2));

        // Unary Operators

        System.out.println("\nUnary Operators");
        System.out.println("=================================\n");

        int number2 = 1;
        int number3 = 1;

        System.out.println("+1 = " + (+1)); // numbers are positive by default
        System.out.println("-1 = " + (-1));
        System.out.println("1++ = " + (number2++));
        System.out.println("--1 = " + (--number3));
        System.out.println("!true = " + (!true));

        int number4 = 0;
        int number5 = 1 + number4++;
        int number6 = 1 + (++number4);
        number4 += number6;

        System.out.println("number5 = " + number5);
        System.out.println("number6 = " + number6);
        System.out.println("number4 = " + number4);

        // Equality and Relational Operators

        System.out.println("\nEquality and Relational Operators");
        System.out.println("=================================\n");

        System.out.println("1 == 2 ? " + (1 == 2));
        System.out.println("1 != 1 ? " + (1 != 2));
        System.out.println("1 > -1 ? " + (1 > -1));
        System.out.println("1 >= 1 ? " + (1 >= 1));
        System.out.println("1 < 0 ? " + (1 < 0));
        System.out.println("1 <= 2 ? " + (1 <= 2));

        // Conditional Operators

        System.out.println("\nConditional Operators");
        System.out.println("=================================\n");

        System.out.println("true && false ? " + (true && false));
        System.out.println("true || false ? " + (true || false));

        int number7 = 2;
        int result = number7 > 5 || number7 <= 3 ? 1 : 2;
        System.out.println("result = " + result);

        // Type Comparison Operator

        System.out.println("\nType Comparison Operator");
        System.out.println("=================================\n");

        System.out.println("\"test\" instance of String ? " + ("test" instanceof String));

        // Bitwise and Bit Shift Operators

        System.out.println("\nBitwise and Bit Shift Operators");
        System.out.println("=================================\n");

        System.out.println("~1 = " + (~1));
        System.out.println("1 << 2 = " + (1 << 2));
        System.out.println("-2 >> 1 = " + (-2 >> 1));
        System.out.println("-2 >>> 1 = " + (-2 >>> 1));
        System.out.println("1 & 2 = " + (1 & 2));
        System.out.println("1 ^ 2 = " + (1 ^ 2));
        System.out.println("1 | 2 = " + (1 | 2));
    }
}