package generics;

public class GenericsExamples {
    public static void main(String[] args) {
        // Generic Classes with One Type Parameter

        System.out.println("Generic Classes with One Type Parameter");
        System.out.println("=============================================\n");

        Box<Integer> integerBox1 = new Box<Integer>();
        System.out.println(integerBox1.get());

        Box<Integer> integerBox2 = new Box<>();
        System.out.println(integerBox2.get());

        // Generic Classes with Multiple Type Parameters

        System.out.println("\nGeneric Classes with Multiple Type Parameters");
        System.out.println("=============================================\n");

        Pair<String, String> pair1 = new OrderedPair<String, String>("Hello", "World");
        System.out.println(pair1.getKey() + " - " + pair1.getValue());

        Pair<String, String> pair2 = new OrderedPair<>("Hello", "World");
        System.out.println(pair2.getKey() + " - " + pair2.getValue());

        OrderedPair<String, String> pair3 = new OrderedPair<String, String>("Hello", "World");
        System.out.println(pair3.getKey() + " - " + pair3.getValue());

        OrderedPair<String, String> pair4 = new OrderedPair<>("Hello", "World");
        System.out.println(pair4.getKey() + " - " + pair4.getValue());

        OrderedPair<String, Box<Integer>> pair5 = new OrderedPair<>("Hello", new Box<>());
        System.out.println(pair5.getKey() + " - " + pair5.getValue());

        // Raw Types

        System.out.println("\nRaw Types");
        System.out.println("=============================================\n");

        Box rawBox = new Box();
        rawBox.set(123);
        System.out.println(rawBox.get());

        Box<String> stringBox1 = new Box<>();
        stringBox1.set("Test");
        System.out.println(stringBox1.get());

        rawBox = stringBox1;
        System.out.println(rawBox.get());

        Box<String> stringBox2 = rawBox; // warning - unchecked conversion
        System.out.println(stringBox2.get());

        // Generic Methods

        System.out.println("\nGeneric Methods");
        System.out.println("=============================================\n");

        Pair<Integer, String> pair6 = new OrderedPair<>(1, "apple");
        Pair<Integer, String> pair7 = new OrderedPair<>(2, "pear");
        boolean same = compare(pair6, pair7);
        System.out.println("Are pairs same? " + same);

        // Bounded Type Parameters

        System.out.println("\nBounded Type Parameters");
        System.out.println("=============================================\n");

        Box<Integer> integerBox3 = new Box<>();
        integerBox3.set(new Integer(1));
        integerBox3.inspect(1);
        // integerBox3.inspect("text"); error - String is not a Number

        NaturalNumber<Integer> naturalNumber = new NaturalNumber<>(2);
        System.out.println("\nIs number even? " + naturalNumber.isEven());

        // Upper Bounded, Lower Bounded and Unbounded Wildcards

        Box<Number> longBox = new Box<>();
        longBox.set(1000000000000000000L);

        System.out.println("\nUnbounded Wildcards");
        System.out.println("=============================================\n");

        System.out.println("String box value: " + Box.toStringBox(longBox).get());

        System.out.println("\nUpper Bounded Wildcards");
        System.out.println("=============================================\n");

        System.out.println("Int box value: " + Box.toIntBox(longBox).get());

        System.out.println("\nLower Bounded Wildcards");
        System.out.println("=============================================\n");

        Box<String> stringBox3 = new Box<>();
        stringBox3.set("First");

        OrderedPair<String, ?> stringNumberPair = OrderedPair.buildStringNumberPair(stringBox3, longBox);
        System.out.println("Pair key: " + stringNumberPair.getKey() + ", pair value: " + stringNumberPair.getValue());
    }

    public static <K, V> boolean compare(Pair<K, V> pair1, Pair<K, V> pair2) {
        return pair1.getKey().equals(pair2.getKey()) &&
            pair1.getValue().equals(pair2.getValue());
    }

    // Multiple Bounds

    class A {}
    interface B {}
    interface C {}

    class D<T extends A & B & C> {}
    // class E<T extends B & A & C> {} - compile error - class types must be specified first
}