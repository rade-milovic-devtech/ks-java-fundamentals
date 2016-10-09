package variables;

public class VariablesExamples {
    private static int numberValue;

    public static void main(String[] args) {
        // Naming

        int $number = 1; // legal but not used
        int _number = 1; // legal but discouraged
        // int 1number = 1; - illegal
        // int !number = 1; - illegal
        int number = 1;
        int number2 = 1;
        int number$_3 = 1;

        // Primitive Data Types

        System.out.println("Primitive Data Types");
        System.out.println("==============================\n");

        System.out.println("Int variable with default value: " + numberValue);

        byte byteValue = 1; // 8-bit signed (-128, 127), default: 0
        System.out.println("Byte value: " + byteValue);

        short shortValue = 1; // 16-bit signed (-32 768, 32 767), default: 0
        System.out.println("Short value: " + shortValue);

        int integerValue = 1; // 32-bit signed (-2e31, 2e31 - 1), java 8 supports unsigned int (2e32 - 1), default: 0
        System.out.println("Int value: " + integerValue);

        long longValue = 1; // 64-bit signed (-2e63, 2e63 - 1), java 8 supports unsigned long (2e64 - 1), default: 0L
        System.out.println("Long value: " + longValue);

        float floatValue = 1.01234567890123f; // 32-bit single-precision, default: 0.0f
        System.out.println("Float value: " + floatValue);

        double doubleValue = 1.01234567890123d; // 64-bit double-precision, default: 0.0d
        System.out.println("Double value: " + doubleValue);

        boolean booleanValue = true; // 1-bit true(1) / false(0), default: false
        System.out.println("Boolean value: " + booleanValue);

        char charValue = 'a'; // 16-bit unicode character (\u0000 - 0, \uffff - 65 535), default: \u0000
        System.out.println("Char value: " + charValue);

        String stringValue = "Здраво Свима!"; // UTF-16 character support
        System.out.println("String value: " + stringValue);

        // Integer Number Literals

        System.out.println("\nInteger Number Literals");
        System.out.println("==============================\n");

        System.out.println("Long: " + 1000000000000000000L);
        System.out.println("Integer decimal: " + 26);
        System.out.println("Integer hexadecimal: " + 0x1a);
        System.out.println("Integer binary: " + 0b11010);

        // Floating-Point Number Literals

        System.out.println("\nFloating-Point Number Literals");
        System.out.println("==============================\n");

        System.out.println("Double: " + 123.4);
        System.out.println("Double with exponent: " + 1.234e2);
        System.out.println("Float: " + 1.234e2);

        // Character and String Literals

        System.out.println("\nCharacter and String Literals");
        System.out.println("==============================\n");

        System.out.println("Backspace character: " + "ab\bc");
        System.out.println("Tab character: " + "ab\tc");
        System.out.println("Line feed character: " + "ab\nc");
        System.out.println("Form feed character: " + "ab\fc");
        System.out.println("Carriage return character: " + "ab\rc");
        System.out.println("Double quote character: " + "\"");
        System.out.println("Single quote character: " + "\'");
        System.out.println("Backslash character: " + "\\");
        System.out.println("NULL value: " + null);
        System.out.println(".class value: " + String.class);

        // Underscore Characters in Numeric Literals

        // float example1 = 3_.1415f; - invalid
        // float example2 = 3._1415f; - invalid
        // long example3 = 999_99_9999_L; - invalid
        int example4 = 5_2;
        // int example5 = 52_; - invalid
        int example6 = 5_____2;
        // int example7 = 0_x52; - invalid
        // int example8 = 0x_52; - invalid
        int example9 = 0x5_2;
        // int example10 = 0x52_; - invalid
    }
}