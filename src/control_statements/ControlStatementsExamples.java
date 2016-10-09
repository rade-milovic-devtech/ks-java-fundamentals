package control_statements;

public class ControlStatementsExamples {
    public static void main(String[] args) {
        // If-Then-Else Statements

        System.out.println("If-Then-Else Statements");
        System.out.println("==================================\n");

        int number = 3;

        if (number >= 3) {
            System.out.println(number + " is higher or equal to 3.");
        }

        if (number >= 4) {
            System.out.println(number + " is higher or equal to 4.");
        } else {
            System.out.println(number + " is not higher or equal to 4.");
        }

        if (number > 3) {
            System.out.println(number + " is higher than 3.");
        } else if (number <=2 || number > 5) {
            System.out.println(number + " is lower or equal to 2 or higher than 5.");
        } else {
            System.out.println("Neither of above statements is true.");
        }

        // Switch Statement

        System.out.println("\nSwitch Statement");
        System.out.println("==================================\n");

        int number2 = 3;

        switch (number2) {
            case 1:
                System.out.println("Number is equal to 1.");
                break;
            case 2:
                System.out.println("Number is equal to 2.");
                break;
            default:
                System.out.println("Number value is unknown.");
        }

        // While, Do-While and For Statements

        System.out.println("\nWhile, Do-While and For Statements");
        System.out.println("==================================\n");

        int[] numbers = new int[] { 1, 2, 3, 4, 5 };
        int index = 0;

        System.out.println("While statement:");

        while (index < numbers.length) {
            System.out.println(numbers[index] + " ");
            index++;
        }
        System.out.println();

        System.out.println("Do-while statement:");

        index = 0;
        do {
            System.out.println(numbers[index] + " ");
        } while (index < 0);
        System.out.println();

        System.out.println("For statement:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("Foreach statement:");

        for (int element : numbers) {
            System.out.println(element + " ");
        }
    }
}